package com.example.Thymeleaf.Demo.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fighter {

    private int id;

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 30, message = "Name must be between 2 and 30 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Name must contain only letters and spaces")
    private String name;

    @NotNull(message = "Health is required")
    @Min(value = 1001, message = "Health must be greater than 1000")
    @Max(value = 1499, message = "Health must be less than 1500")
    private Integer health;

    @NotNull(message = "Damage is required")
    @DecimalMax(value = "99.9999", message = "Damage must be less than 100")
    private Double damage;

    @NotNull(message = "Resistance is required")
    @DecimalMin(value = "0.0", message = "Resistance must be at least 0")
    @DecimalMax(value = "10.0", message = "Resistance must be at most 10")
    private Double resistance;

}