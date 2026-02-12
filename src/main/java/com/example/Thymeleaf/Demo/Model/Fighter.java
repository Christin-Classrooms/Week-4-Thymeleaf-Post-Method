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
@AllArgsConstructor
@NoArgsConstructor
public class Fighter {

    private int id;
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Min(value = 999, message = "Health must be between 1001 & 1499")
    @Max(value = 1501, message = "Health must be between 1001 & 1499")
    @NotNull(message = "Health cannot be empty")
    private Integer health;

    @NotNull(message = "Damage cannot be empty")
    @Min(value = 1, message = "Damage must be in range 1-99")
    @Max(value = 99, message = "Damage must be in range 1-99")
    private Integer damage;


    @DecimalMin(value = "0.0", message = "Resistance must be greater than 0.0")
    @DecimalMax(value = "10.0", message = "Resistance must be less than 10.0")
    @NotNull(message = "Resistance cannot be empty")
    private Double resistance;

}