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
    @Size(min = 2, max=240, message = "Name size must be between 2 and 240 characters.")
    @NotBlank(message = "Name is required.")
    private String name;
    @NotNull(message = "Health is required.")
    @Min(value = 1000, message = "Health must be greater than or equal to 1000.")
    @Max(value = 1500, message = "Health must be less than or equal to 1500.")
    private Integer health;
    @NotNull(message = "Damage is required.")
    @DecimalMin(value = "0.0", message = "Damage must be greater than 0.")
    @DecimalMax(value = "100.0", message = "Damage must be less than or equal to 100.")
    private Double damage;
    @NotNull(message = "Resistance is required.")
    @DecimalMin(value = "0.0", message = "Resistance must be greater than 0.")
    @DecimalMax(value = "10.0", message = "Resistance must be less than or equal to 10.")
    private Double resistance;

}
