package SmartCampus.validation;

import SmartCampus.dto.ReservationDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ReservationDatesValidator
        implements ConstraintValidator<ValidReservationDates, ReservationDTO> {

            @Override
            public boolean isValid(
                    ReservationDTO reservation,
                    ConstraintValidatorContext context) {
            
                        System.out.println("VALIDATOR CALLED");

                if (reservation == null ||
                    reservation.startDateTime() == null ||
                    reservation.endDateTime() == null) {
                    return true;
                }
            
                return reservation.startDateTime()
                        .isBefore(reservation.endDateTime());
            }
}