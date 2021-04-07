package com.makaixuan.springbootmybatis.service;

import com.makaixuan.springbootmybatis.entity.CITY;

import java.util.List;

public interface ServiceDao {

    public CITY findById(int id);

    public List<CITY> getCities();

    public int deleteById(int id);

    public int updateById(CITY city);

    public int insertCity(CITY city);
}
