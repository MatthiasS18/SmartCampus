package SmartCampus.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ReservationDatesValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidReservationDates {

    String message() default "startDateTime must be before endDateTime";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}