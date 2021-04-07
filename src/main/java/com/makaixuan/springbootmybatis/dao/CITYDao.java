package com.makaixuan.springbootmybatis.dao;

import com.makaixuan.springbootmybatis.entity.CITY;

import java.util.List;

public interface CITYDao {

    public CITY findById(int id);

    public List<CITY> getCities();

    public int deleteById(int id);

    public int updateById(CITY city);

    public int insertCity(CITY city);


}
