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
    
    @Min(value = 1001, message = "Health must be more than 1000")
    @Max(value = 1499, message = "Health must be less than 1500")
    private Integer health;
    
    @Max(value = 99, message = "Damage must be less than 100")
    @Positive(message = "Damage must be positive")
    private Integer damage;
    
    @DecimalMin(value = "0.0", message = "Resistance must be at least 0")
    @DecimalMax(value = "10.0", message = "Resistance must be at most 10")
    private Double resistance;
}
