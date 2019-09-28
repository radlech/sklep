package pl.rlechowicz.sklep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.rlechowicz.sklep.model.Category;
import pl.rlechowicz.sklep.repository.CategoryRepository;

import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;

    public CategoryServiceImpl(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public List<Category> getCategories() {
        List<Category> categories = categoryRepo.findAll();
        Collections.sort(categories);
        return categories;
    }

}
