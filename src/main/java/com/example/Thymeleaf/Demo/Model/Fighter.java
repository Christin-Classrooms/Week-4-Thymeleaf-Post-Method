package com.example.Thymeleaf.Demo.Model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Fighter {

    @NotBlank(message = "Name is required")
    private String name;

    @Min(value = 1, message = "Health must be at least 1")
    private int health;

    @Min(value = 1, message = "Damage must be at least 1")
    private int damage;

    @Min(value = 0, message = "Resistance must be 0 or higher")
    private int resistance;

    public Fighter() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public int getResistance() { return resistance; }
    public void setResistance(int resistance) { this.resistance = resistance; }
}
