package com.makaixuan.springbootmybatis.service;

import com.makaixuan.springbootmybatis.dao.CITYDao;
import com.makaixuan.springbootmybatis.entity.CITY;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDaoImpl implements ServiceDao{

    @Autowired()
    private CITYDao cityDao;

    @Override
    public CITY findById(int id) {
        return cityDao.findById(id);
    }

    @Override
    public List<CITY> getCities() {
        return cityDao.getCities();
    }

    @Override
    public int deleteById(int id) {
        return cityDao.deleteById(id);
    }

    @Override
    public int updateById(CITY city) {
        return cityDao.updateById(city);
    }

    @Override
    public int insertCity(CITY city) {
        return cityDao.insertCity(city);
    }
}
