package SmartCampus.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import SmartCampus.model.IncidentStatus;
import SmartCampus.model.Priority;

public record IncidentDTO(

        Long id,

        @NotBlank
        String title,

        String description,

        @NotNull
        Priority priority,

        @NotNull
        IncidentStatus status,

        @NotNull
        Long roomId,

        @NotNull
        Long userId
) {
}