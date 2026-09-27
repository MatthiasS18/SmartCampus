package SmartCampus.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EquipmentDTO(

        Long id,

        @NotBlank
        String name,

        @NotBlank
        String type,

        @NotNull
        Long roomId
) {
}