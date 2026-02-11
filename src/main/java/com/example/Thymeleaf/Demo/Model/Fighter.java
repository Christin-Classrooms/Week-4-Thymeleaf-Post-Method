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

    @NotBlank(message="Name is required")
    private String name;

    @NotNull(message="Health is required")
    @Min(value = 1000, message="Health must be at least 1000")
    @Max(value = 1500, message="Health must be at most 1500")
    private int health;

    @NotNull(message="Damage is required")
    @Min(value = 0, message="Damage must be at least 0")
    @Max(value = 100, message="Damage must be at most 100")
    private int damage;

    @NotNull(message="Resistance is required")
    @Min(value = 0, message="Resistance must be at least 0")
    @Max(value = 10, message="Resistance must be at most 10")
    private double resistance;

}
