package com.example.Thymeleaf.Demo.Model;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fighter {

    private int id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotNull(message = "Health is required ")
    @Min(value = 1001, message = "Health must be at greater than 1000")
    @Max(value = 1499, message = "Health must be less than 1500 ")
    private Integer health;

    @NotNull(message = "Fighter Damage is required")
    @Max(value = 99, message = "Fighter Damage must be less than 100")
    private Double damage;

    @NotNull(message = "Fighter Resistance must be from 0 to 10 and must be a double value")
    @DecimalMin(value = "0.0", message = "Fighter Resistance must be greater than 0")
    @DecimalMax(value = "10.0", message = "Fighter Resistance must be less than 10")
    private Double resistance;

}
