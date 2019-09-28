package pl.rlechowicz.sklep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.rlechowicz.sklep.dto.RegistrationDto;
import pl.rlechowicz.sklep.service.CategoryService;
import pl.rlechowicz.sklep.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class PageController {

    @Autowired
    private CategoryService categorySrv;

    @Autowired
    private UserService userSrv;

    public PageController(CategoryService categorySrv) {
        this.categorySrv = categorySrv;
    }

    @GetMapping(value = {"","/"})
    public ModelAndView getIndexView() {
        ModelAndView model = new ModelAndView("!template");
        model.addObject("userInfo", userSrv.getUserInfo());
        model.addObject("categories", categorySrv.getCategories());
        return model;
    }

    @GetMapping(value = "/login")
    public ModelAndView getLoginView() {
        ModelAndView model = new ModelAndView("login");
        return model;
    }

    @GetMapping(value = "/logout")
    public String getLogoutView(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/?ok";
    }

    @GetMapping(value = "/register")
    public ModelAndView getRegisterView() {
        ModelAndView model = new ModelAndView("register");
        return model;
    }

    @PostMapping(value = "/register")
    public String postRegister(@ModelAttribute("RegistrationDto") RegistrationDto rDto) {
        try {
            userSrv.registerNewCustomer(rDto);
            return "redirect:/login";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/register/?registerError";
        }
    }

}
