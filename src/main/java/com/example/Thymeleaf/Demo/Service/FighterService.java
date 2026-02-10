// Name: Fahad Arif (N01729165)
// Course: Web Application Development (CPAN-228)

package com.example.Thymeleaf.Demo.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;

@Service
public class FighterService {

    private final List<Fighter> fighters = new ArrayList<>();

    public void addNewFighter(Fighter fighter) {
        fighters.add(fighter);
    }

    public List<Fighter> getAllFighters() {
        return Collections.unmodifiableList(fighters);
    }
}