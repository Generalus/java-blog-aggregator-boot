package cz.jiripinkas.jba.annotation;

import cz.jiripinkas.jba.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void initialize(UniqueUsername constraintAnnotation) {
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        return userRepository == null || userRepository.findByName(username) == null;
    }

}
