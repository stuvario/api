package org.example.api.controllers.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CreateMemberRequest(
        @NotBlank(message = "Can't be empty")
        String firstName,
        @NotBlank(message = "Can't be empty")
        String lastName,
        @Email(message = "Must be email-format")
        @NotBlank(message = "Can't be empty")
        String email,
        @Pattern(regexp = "^((?=\\S*?[A-Z])(?=\\S*?[a-z])(?=\\S*?[0-9]).{6,})\\S$", message = "Invalid format")
        @NotBlank(message = "Cant't be empty")
        String password,
        @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "Invalid phone format")
        String phone
) {
}
