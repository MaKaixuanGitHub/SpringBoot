package com.makaixuan.springbootmybatis.dao;

import com.makaixuan.springbootmybatis.entity.CITY;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CITYDao {

    public CITY findById(@Param("id") int id);

    public List<CITY> getCities();

    public int deleteById(@Param("id") int id);

    public int updateById(CITY city);

    public int insertCity(CITY city);


}
