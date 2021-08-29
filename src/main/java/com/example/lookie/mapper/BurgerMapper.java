package com.example.lookie.mapper;

import java.util.List;

import com.example.lookie.model.Burger;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BurgerMapper {
    @Select("SELECT * FROM burger WHERE is_double=#{is_double} AND patty=#{patty}")
    List<Burger> getBurgerList(@Param("is_double") boolean is_double, @Param("patty") int patty);
}
