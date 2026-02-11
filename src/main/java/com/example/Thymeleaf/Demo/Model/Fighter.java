package com.example.Thymeleaf.Demo.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fighter {

    private int id;
    private String name;
    private Integer health;
    private Double damage;
    private Double resistance;

}
