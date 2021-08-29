package com.example.lookie.mapper;

import com.example.lookie.model.Drink;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DrinkMapper {
    @Select("SELECT * FROM drink WHERE is_ice=#{is_ice} AND category=#{category}")
    List<Drink> getDrinkList(@Param("is_ice") boolean is_ice, @Param("category") int category);
}