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
@NoArgsConstructor
@AllArgsConstructor
public class Fighter {
    private static int counter = 1;
    private int id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotNull(message = "Health is required")
    @Min(value = 1001, message = "Health must be at least 1001")
    @Max(value = 1499, message = "Health must be at most 1499")
    private Integer health;

    @NotNull(message = "Damage is required")
    @Max(value = 99, message = "Damage must be at most 99")
    private Integer damage;

    @NotNull(message = "Resistance is required")
    @DecimalMin(value = "0.0", inclusive = true, message = "Resistance must be at least 0.0")
    @DecimalMax(value = "10.0", inclusive = true, message = "Resistance must be at most 10.0")
    private Double resistance;

    public Fighter(String name, Integer health, Integer damage, Double resistance) {
        this.id = counter++;
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.resistance = resistance;
    }
}