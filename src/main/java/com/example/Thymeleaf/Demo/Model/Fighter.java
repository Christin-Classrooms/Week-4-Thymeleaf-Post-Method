// Name: Fahad Arif (N01729165)
// Course: Web Application Development (CPAN-228)

package com.example.Thymeleaf.Demo.Model;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Fighter {
    @NotBlank(message = "A name is required.")
    private String name;

    @NotNull(message = "Health is required.")
    @Min(value = 1001, message = "The health must be more than 1000.")
    @Max(value = 1499, message = "The health must be less than 1500.")
    private Integer health;

    @NotNull(message = "Damage is required.")
    @Max(value = 99, message = "The damage must be less than 100.")
    private Integer damage;

    @NotNull(message = "Resistance is required.")
    @DecimalMin(value = "0.0", inclusive = true, message = "The resistance must be between 0 and 10.")
    @DecimalMax(value = "10.0", inclusive = true, message = "The resistance must be between 0 and 10.")
    private Double resistance;

    public Fighter() {}

    public Fighter(String name, Integer health, Integer damage, Double resistance) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.resistance = resistance;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getHealth() { return health; }
    public void setHealth(Integer health) { this.health = health; }

    public Integer getDamage() { return damage; }
    public void setDamage(Integer damage) { this.damage = damage; }

    public Double getResistance() { return resistance; }
    public void setResistance(Double resistance) { this.resistance = resistance; }
}