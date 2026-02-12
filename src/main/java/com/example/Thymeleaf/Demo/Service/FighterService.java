package com.example.Thymeleaf.Demo.Service;
import com.example.Thymeleaf.Demo.Model.Fighter;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class FighterService {
    private final List<Fighter> fighters = new ArrayList<>(); 
    public void add(Fighter fighter){
        fighters.add(fighter);
    }
    public List<Fighter>getAll(){
        return Collections.unmodifiableList(fighters);
    }

}
