package com.example.lookie.controller;

import java.util.List;

import com.example.lookie.mapper.DrinkMapper;
import com.example.lookie.model.Drink;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrinkController {
    private DrinkMapper mapper;

    public DrinkController(DrinkMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/drink/{category}")
    public List<Drink> getDrinkList(@RequestParam("is_ice") boolean is_ice, @PathVariable("category") int category) {
        return mapper.getDrinkList(is_ice, category);
    }
}
