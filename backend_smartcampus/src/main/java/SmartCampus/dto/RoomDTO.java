package SmartCampus.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RoomDTO(

        Long id,

        @NotBlank
        String name,

        @NotBlank
        String building,

        @NotNull
        @Min(0)
        Integer floor,

        @NotNull
        @Min(1)
        Integer capacity
) {
}