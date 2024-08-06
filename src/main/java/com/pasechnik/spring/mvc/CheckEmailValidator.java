package com.pasechnik.spring.mvc;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {

    private String endEmail;
    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext context) {
       return enteredValue.endsWith(endEmail);
    }

    @Override
    public void initialize(CheckEmail checkEmail) {
         endEmail = checkEmail.value();
    }
}
