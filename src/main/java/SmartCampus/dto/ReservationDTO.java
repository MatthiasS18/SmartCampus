package SmartCampus.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import SmartCampus.model.ReservationStatus;

public record ReservationDTO(

        Long id,

        @NotNull
        LocalDateTime startDateTime,

        @NotNull
        LocalDateTime endDateTime,

        @NotNull
        ReservationStatus status,

        @NotNull
        Long roomId,

        @NotNull
        Long userId
) {
}