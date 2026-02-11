package com.example.Thymeleaf.Demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.Thymeleaf.Demo.Model.Fighter;


@Service
public class FighterService {

    private final List<Fighter> fighters = new ArrayList<>();

    public void addFighter(Fighter fighter) {
        fighters.add(fighter);
    }

    public List<Fighter> getFighters() {
        return fighters;
    }
}
