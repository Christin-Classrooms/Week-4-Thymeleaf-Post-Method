package com.example.Thymeleaf.Demo.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;
import java.util.ArrayList;
import java.util.List;

public class FighterService {

    private static final List<Fighter> fighters = new ArrayList<>();

    public static List<Fighter> getFighters() {
        return fighters;
    }

    public static void addFighter(Fighter fighter) {
        fighters.add(fighter);
    }
}
