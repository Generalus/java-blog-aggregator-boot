package cz.jiripinkas.jba.service;

import cz.jiripinkas.jba.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllCategoriesService {

    @Autowired
    private CategoryService categoryService;

    public Integer[] getAllCategoryIds() {
        List<Category> categories = categoryService.findAll();
        Integer[] result = new Integer[categories.size()];
        for (int i = 0; i < categories.size(); i++) {
            result[i] = categories.get(i).getId();
        }
        return result;
    }

}
