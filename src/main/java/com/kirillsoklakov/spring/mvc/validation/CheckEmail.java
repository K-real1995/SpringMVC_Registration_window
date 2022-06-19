package com.kirillsoklakov.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Documented
@Constraint(validatedBy = CheckEmailValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckEmail {
    String value() default "gmail.com";
    String message() default "Invalid e-mail. It should be gmail.com";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
