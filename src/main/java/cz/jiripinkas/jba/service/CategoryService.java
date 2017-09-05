package cz.jiripinkas.jba.service;

import cz.jiripinkas.jba.dto.CategoryDto;
import cz.jiripinkas.jba.entity.Blog;
import cz.jiripinkas.jba.entity.Category;
import cz.jiripinkas.jba.repository.BlogRepository;
import cz.jiripinkas.jba.repository.CategoryRepository;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private Mapper mapper;

    @Cacheable("categories")
    public List<Category> findAll() {
        List<Category> categories = categoryRepository.findAll();
        for (Category category : categories) {
            category.setBlogCount(blogRepository.countByCategoryId(category.getId()));
        }
        return categories;
    }

    @CacheEvict(value = "categories", allEntries = true)
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @CacheEvict(value = "categories", allEntries = true)
    public void delete(int id) {
        categoryRepository.delete(id);
    }

    public CategoryDto findOneDto(int id) {
        return mapper.map(categoryRepository.findOne(id), CategoryDto.class);
    }

    @CacheEvict(value = "blogCountUnapproved", allEntries = true)
    public void addMapping(int blogId, int categoryId) {
        Category category = categoryRepository.findOne(categoryId);
        Blog blog = blogRepository.findOne(blogId);
        blog.setCategory(category);
        blogRepository.save(blog);
    }

}
