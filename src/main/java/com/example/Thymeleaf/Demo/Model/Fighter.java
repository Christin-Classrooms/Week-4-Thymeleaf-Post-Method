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

    @NotNull(message = "Health is required")
    @Min(value = 1000, message = "Health must be over 1000")
    @Max(value = 1500, message = "Health must be under 1500")
    private Integer health;

    @NotNull(message = "Damage is required")
    @DecimalMax(value = "100", message = "Damage must be less than 100")
    private Double damage;

    @NotNull(message = "Resistance is required")
    @DecimalMax(value = "10", message = "Resistance must be lower than 10")
    private Double resistance;

}
