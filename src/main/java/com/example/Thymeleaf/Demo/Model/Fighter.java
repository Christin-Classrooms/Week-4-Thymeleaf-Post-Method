package com.example.thymeleafdemo.model;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Fighter {

    @NotBlank(message = "Name is required")
    private String name;

    @Min(value = 1001, message = "Health must be greater than 1000")
    @Max(value = 1499, message = "Health must be less than 1500")
    private int health;

    @Max(value = 99, message = "Damage must be less than 100")
    private int damage;

    @DecimalMin(value = "0.0", message = "Resistance must be at least 0")
    @DecimalMax(value = "10.0", message = "Resistance must be at most 10")
    private double resistance;

    public Fighter() {}

    public Fighter(String name, int health, int damage, double resistance) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.resistance = resistance;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public double getResistance() { return resistance; }
    public void setResistance(double resistance) { this.resistance = resistance; }
}

