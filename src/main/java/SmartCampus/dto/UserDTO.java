package SmartCampus.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import SmartCampus.model.Role;

public record UserDTO(

        Long id,

        @NotBlank
        String name,

        @NotBlank
        @Email
        String email,

        @NotNull
        Role role
) {
}