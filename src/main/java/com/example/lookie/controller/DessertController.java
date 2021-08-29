package com.example.lookie.controller;

import java.util.List;

import com.example.lookie.mapper.DessertMapper;
import com.example.lookie.model.Dessert;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DessertController {

    private DessertMapper mapper;

    public DessertController(DessertMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/dessert/{is_icecream}")
    public List<Dessert> getDessertList(@PathVariable("is_icecream") boolean is_icecream) {
        return mapper.getDessertList(is_icecream);
    }
}