package de.daroge.cqrs.writeside.core.application;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class Validatable<T> {

    private Validator validator;
    public Validatable(){
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    public void validate(){
        Set<ConstraintViolation<T>> violations = validator.validate((T)this);
        if(!violations.isEmpty()) {
            String errorFielder =  violations
                    .stream()
                    .map(v -> v.getInvalidValue().toString())
                    .collect(Collectors.joining(", " ,"[","]"));
            // TODD throw an exception
        }
    }
}
