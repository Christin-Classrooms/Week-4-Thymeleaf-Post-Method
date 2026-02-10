package com.example.Thymeleaf.Demo.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FighterService {
    private final List<Fighter> fighterPool = new ArrayList<>();

    private int idCount = 1;
    public void addFighter(Fighter fighter) {
        fighter.setId(idCount++);
        fighterPool.add(fighter);
    }

    public List<Fighter> getFighterPool() {
        return fighterPool;
    }
}
