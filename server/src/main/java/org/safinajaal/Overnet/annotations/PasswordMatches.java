package org.safinajaal.Overnet.annotations;

import org.safinajaal.Overnet.validations.PasswordMatchesValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMatchesValidator.class)
@Documented
public @interface PasswordMatches {
    String message() default "Password doesn't match";

    Class<?>[] groups() default{};

    Class<? extends Payload>[] payload() default {};
}
