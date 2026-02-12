package com.example.Thymeleaf.Demo.Model;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.*;
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

    @NotNull(message = "Health is required")
    @Min(value = 1001, message ="Health need to be more than 1000")
    @Max(value = 1499, message ="Health need to be less then 1500")
    private Integer health;

    @NotNull(message ="Damage value is required")
    @Max(value= 99, message= "Damage must be less then 100")
    private Integer damage;


    @NotNull(message = "Resistance value is required")
    @DecimalMin(value="0.0", inclusive = true, message = "Resistance needs to be between 0.0 - 10.0")
    @DecimalMax(value="10.0", inclusive = true, message = "Resistance needs to be between 0.0 - 10.0" )
    private Double resistance;
   

    public Fighter(String name, Integer health, Integer damage, Double reistance){
        this.name=name; 
        this.health =health; 
        this.damage = damage; 
        this.resistance=reistance;
    }

    public String getName(){
        return name; 
    }
    public void setName(String name){
        this.name=name;
    }

     public Integer getHealth(){
        return health; 
    }
    public void setHealth(Integer health){
        this.health=health;
    }

     public Integer getDamage(){
        return damage; 
    }
    public void setDamage(Integer damage){
        this.damage=damage;
    }

     public Double getResistance(){
        return resistance; 
    }
    public void setResistance(Double resistance){
        this.resistance=resistance;
    }

}
