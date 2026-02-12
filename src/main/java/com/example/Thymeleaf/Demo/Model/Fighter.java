package com.example.Thymeleaf.Demo.Model;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Fighter {
    @NotBlank(message = "Name is required")
    private String name;
    
    @NotNull(message = "Health is required")
    @Min(value = 1001, message = "Health must be more than 1000")
    @Max(value = 1499, message = "Health must be less than 1500")
    private Integer health;
    
    @NotNull(message = "Damage is required")
    @Max(value = 99, message = "Damage must be less than 100")
    private Integer damage;
    
    @NotNull(message = "Resistance is required")
    @DecimalMin(value = "0.0", message = "Resistance must be 0 or more")
    @DecimalMax(value = "10.0", message = "Resistance must be 10 or less")
    private Double resistance;
    
    // Default constructor
    public Fighter() {}
    
    // Constructor with all fields
    public Fighter(String name, Integer health, Integer damage, Double resistance) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.resistance = resistance;
    }
    
    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public Integer getHealth() { return health; }
    public void setHealth(Integer health) { this.health = health; }
    
    public Integer getDamage() { return damage; }
    public void setDamage(Integer damage) { this.damage = damage; }
    
    public Double getResistance() { return resistance; }
    public void setResistance(Double resistance) { this.resistance = resistance; }
}

