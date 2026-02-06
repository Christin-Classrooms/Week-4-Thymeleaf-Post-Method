package com.example.Thymeleaf.Demo.Model;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fighter {

    private int id;

    @NotBlank(message="The name is required")
    @Size(min=2, max=240, message="name size must be > 2 and <240")
    private String name;

    @Min(1001)
    @Max(1499)
    private Integer health;

    @DecimalMin(value="0.0", inclusive=true)
    @DecimalMax(value="100.0", inclusive=false)
    private Double damage;

    @DecimalMin(value="0.0", inclusive=true)
    @DecimalMax(value="10.0", inclusive=true)
    private Double resistance;

}
