package com.example.Thymeleaf.Demo.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class FighterService {

    private List<Fighter> fighters;
    private static int nextId = 1;
    
    public FighterService() {
        fighters = new ArrayList<>();
        // Add some sample fighters
        fighters.add(new Fighter(1, "Ryu", 1200, 85.5, 4.5));
        fighters.add(new Fighter(2, "Chun-Li", 1100, 75.0, 6.5));
        fighters.add(new Fighter(3, "Ken", 1250, 90.0, 3.5));
        fighters.add(new Fighter(4, "Akuma", 1400, 95.0, 2.0));
        fighters.add(new Fighter(5, "Cammy", 1150, 80.0, 5.5));
        nextId = 6;
    }

    public List<Fighter> getAllFighters() {
        return fighters;
    }

    public void addFighter(Fighter fighter) {
        fighter.setId(nextId++);
        fighters.add(fighter);
    }

}
