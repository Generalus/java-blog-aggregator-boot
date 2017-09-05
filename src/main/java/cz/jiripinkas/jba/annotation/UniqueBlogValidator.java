package cz.jiripinkas.jba.annotation;

import cz.jiripinkas.jba.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueBlogValidator implements ConstraintValidator<UniqueBlog, String> {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public void initialize(UniqueBlog constraintAnnotation) {
    }

    @Override
    public boolean isValid(String url, ConstraintValidatorContext context) {
        if (blogRepository == null) {
            return true;
        }
        return blogRepository.findByUrl(url) == null;
    }

}
