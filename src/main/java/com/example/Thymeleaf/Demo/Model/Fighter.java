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
    
    // Fighter name is required, validated with @NotBlank
    @NotBlank(message = "Fighter name is required")
    private String name;
    
    // Fighter health points (1000–1500), validated with @NotNull, @Min, and @Max
    @NotNull(message = "Health is required")
    @Min(value = 1000, message = "Health must be more than 1000")
    @Max(value = 1500, message = "Health must be less than 1500")
    private Integer health;
    
    // Fighter damage (0–99), uses Double, validated with @Max
    @NotNull(message = "Damage is required")
    @DecimalMax(value = "99.0", message = "Damage must be less than 100")
    @DecimalMin(value = "0.1", message = "Damage must be greater than 0")
    private Double damage;
    
    // Fighter resistance (0.0–10.0), uses Double, validated with @DecimalMin and @DecimalMax
    @NotNull(message = "Resistance is required")
    @DecimalMin(value = "0.0", message = "Resistance must be between 0 and 10")
    @DecimalMax(value = "10.0", message = "Resistance must be between 0 and 10")
    private Double resistance;
    
}