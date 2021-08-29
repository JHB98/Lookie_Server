package com.example.lookie.controller;

import java.util.List;

import com.example.lookie.mapper.BurgerMapper;
import com.example.lookie.model.Burger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BurgerController {
    private BurgerMapper mapper;

    public BurgerController(BurgerMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/burger/{patty}")
    public List<Burger> getBurgerList(@RequestParam("is_double") boolean is_double, @PathVariable("patty") int patty) {
        return mapper.getBurgerList(is_double, patty);
    }
}
