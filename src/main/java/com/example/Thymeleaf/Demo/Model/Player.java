package com.example.Thymeleaf.Demo.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    private int id;
    @Size(min=2, max=240, message="name size must be > 2 and <240")
    @NotBlank(message="The name is required")
    private String name;
    @NotBlank(message = "The email is not required")
    @Email(message = "invalid email")
    private String email;

}
