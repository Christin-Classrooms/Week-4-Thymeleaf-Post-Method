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

    @NotBlank(message="name is required")
    @Size(min=2, max=240, message="name size must be > 2 and <240")
    private String name;
    
    @NotNull(message="health is required")
    @Min(value= 1001, message ="Health must be gretaer than 1000")
    @Max(value= 1499, message ="Health must be less than 1500")
    private Integer health;
    
    @NotNull(message="damage is required")
    @Max(value=99, message = "Damage must be less than 100")
    private Double damage;
    
    @NotNull(message="resistance is required")
    @DecimalMin(value ="0.0", message="Resistance must be at least 0")
    @DecimalMax(value ="10.0", message="Resistance must not exceed 10")
    private Double resistance;

}
