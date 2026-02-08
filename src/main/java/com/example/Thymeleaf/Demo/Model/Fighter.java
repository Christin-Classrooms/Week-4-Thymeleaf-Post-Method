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
    private String name;

    @Min(value = 1000, message = "Health must be more than 1000")
    @Max(value = 1500, message = "Health must be less than 1500")
    @NotNull(message = "Health is required")
    private Integer health;

    @DecimalMax(value = "100.0", message = "Damage must be less than 100")
    @NotNull(message = "Damage is required")
    private Double damage;

    @DecimalMin(value = "0.0", message = "Resistance must be greater than 0")
    @DecimalMax(value = "10.0", message = "Resistance must be less than 10")
    @NotNull(message = "Resistance is required")
    private Double resistance;

}
