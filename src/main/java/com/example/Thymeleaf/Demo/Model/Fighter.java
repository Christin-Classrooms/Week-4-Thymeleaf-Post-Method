package com.example.Thymeleaf.Demo.Model;

import jakarta.validation.constraints.*;

public class Fighter {

    @NotBlank(message = "Name required")
    private String name;

    @NotNull
    @Min(1001)
    @Max(1499)
    private Integer health;

    @NotNull
    @Max(99)
    private Integer damage;

    @NotNull
    @DecimalMin("0.0")
    @DecimalMax("10.0")
    private Double resistance;

    public Fighter() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getHealth() { return health; }
    public void setHealth(Integer health) { this.health = health; }

    public Integer getDamage() { return damage; }
    public void setDamage(Integer damage) { this.damage = damage; }

    public Double getResistance() { return resistance; }
    public void setResistance(Double resistance) { this.resistance = resistance; }
}