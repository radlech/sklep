package pl.rlechowicz.sklep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.rlechowicz.sklep.dto.RegistrationDto;
import pl.rlechowicz.sklep.model.Customer;
import pl.rlechowicz.sklep.model.Employee;
import pl.rlechowicz.sklep.model.User;
import pl.rlechowicz.sklep.repository.CustomerRepository;
import pl.rlechowicz.sklep.repository.EmployeeRepository;
import pl.rlechowicz.sklep.repository.UserRepository;

import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private CustomerRepository customerRepo;

    @Autowired
    private EmployeeRepository employeeRepo;

    public UserServiceImpl(UserRepository userRepo, CustomerRepository customerRepo, EmployeeRepository employeeRepo) {
        this.userRepo = userRepo;
        this.customerRepo = customerRepo;
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Optional<String> getUserInfo() {
        String result = null;
        Optional<User> user = userRepo.findByEmail(SecurityContextHolder.getContext().getAuthentication().getName());
        if (user.isPresent()) {
            Optional<Customer> customer = customerRepo.findById(user.get().getUserId());
            Optional<Employee> employee = employeeRepo.findById(user.get().getUserId());
            if (customer.isPresent())
                result = customer.get().getFirstname() + " " + customer.get().getLastname();
            else if (employee.isPresent())
                result = employee.get().getFirstname() + " " + employee.get().getLastname();
        }
        return Optional.ofNullable(result);
    }

    @Override
    public void registerNewCustomer(RegistrationDto rDto) throws Exception {
        if (!rDto.getPasswordA().equals(rDto.getPasswordB()))
            throw new Exception();
        User u = new User();
        u.setEmail(rDto.getEmail());
        u.setPassword(new BCryptPasswordEncoder(12).encode(rDto.getPasswordA()));
        u.setRole("ROLE_CUSTOMER");
        u.setActive(Boolean.TRUE);
        userRepo.saveAndFlush(u);
        Customer c = new Customer();
        c.setUserId(u.getUserId());
        c.setFirstname(rDto.getFirstname());
        c.setLastname(rDto.getLastname());
        c.setPhone(rDto.getPhone());
        c.setAddress(rDto.getAddress());
        c.setCity(rDto.getCity());
        c.setPostalCode(rDto.getPostalCode());
        customerRepo.saveAndFlush(c);
    }

}
