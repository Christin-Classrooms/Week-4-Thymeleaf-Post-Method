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
    
    /*
     * fighter's name, cant be blank or null, and must be between 1 and 100 characters.
     * health, cant be null, must be more than 1000 and less than 1500.
     * damage, cant be null, must be less than 100.
     * resistance, cant be null, must be between 0 and 10.
     */

    @NotBlank(message = "Name is required")
    @Size(min = 1, max = 100, message = "Name has to be between 1 and 100 characters")
    private String name;
    
    @NotNull(message = "Health is required")
    @Min(value = 1001, message = "Health has to be more than 1000")
    @Max(value = 1499, message = "Health has to be less than 1500")
    private Integer health;
    
    @NotNull(message = "Damage is required")
    @DecimalMax(value = "99.9", message = "Damage has to be less than 100")
    private Double damage;
    
    @NotNull(message = "Resistance is required")
    @DecimalMin(value = "0.0", message = "Resistance has to be at least 0")
    @DecimalMax(value = "10.0", message = "Resistance has to be at most 10")
    private Double resistance;
}