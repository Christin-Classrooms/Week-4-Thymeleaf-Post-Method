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

    @Size(min=2, max=50, message="Name must be between 2 and 50 characters")
    @NotBlank(message="Name is required")
    private String name;

    @Min(value=1, message="Health must be at least 1")
    @Max(value=1000, message="Health cannot exceed 1000")
    @NotNull(message="Health is required")
    private Integer health;

    @DecimalMin(value="0.1", message="Damage must be at least 0.1")
    @DecimalMax(value="100.0", message="Damage cannot exceed 100")
    @NotNull(message="Damage is required")
    private Double damage;

    @DecimalMin(value="0.0", message="Resistance must be at least 0")
    @DecimalMax(value="1.0", message="Resistance cannot exceed 1.0")
    @NotNull(message="Resistance is required")
    private Double resistance;
}