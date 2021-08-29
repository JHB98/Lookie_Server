package com.example.lookie.mapper;

import java.util.List;

import com.example.lookie.model.Dessert;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DessertMapper {
    @Select("SELECT * FROM dessert WHERE is_icecream=#{is_icecream}")
    List<Dessert> getDessertList(@Param("is_icecream") boolean is_icecream);
}