package com.example.Thymeleaf.Demo.Model;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Contact {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;
}

