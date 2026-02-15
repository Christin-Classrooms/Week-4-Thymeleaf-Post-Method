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

    @NotBlank(message = "fighter name is required")
    @Size(min = 2, max = 240, message = "fighter name size must be > 2 and <240")
    private String name;

    @NotNull(message = "health is required")
    @Min(value = 1001, message = "health must be more than 1000")
    @Max(value = 1499, message = "health must be less than 1500")
    private Integer health;

    @NotNull(message = "damage is required")
    @Max(value = 99, message = "damage must be less than 100")
    private Integer damage;

    @NotNull(message = "resistance is required")
    @DecimalMin(value = "0.0", message = "resistance must be between 0 and 10")
    @DecimalMax(value = "10.0", message = "resistance must be between 0 and 10")
    private Double resistance;
}
