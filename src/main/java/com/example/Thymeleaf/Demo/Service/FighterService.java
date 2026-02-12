package com.example.Thymeleaf.Demo.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FighterService {

    private final List<Fighter> fighters = new ArrayList<>();

    public void add(Fighter fighter) {
        fighters.add(fighter);
    }

    public List<Fighter> getAll() {
        return fighters;
    }
}