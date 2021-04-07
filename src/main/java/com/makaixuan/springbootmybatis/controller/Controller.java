package com.makaixuan.springbootmybatis.controller;

import com.makaixuan.springbootmybatis.entity.CITY;
import com.makaixuan.springbootmybatis.service.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ServiceDao serviceDao;

    /* **************
     * restFul style
     * **************
     * GET : SELECT
     * PUT : INSERT
     * POST : UPDATE
     * DELETE : DELETE
     */
    /**
     * 1.表单提交是只有get/post的 ?
     * 那么如何实现这个delete/put呢？
     * 其实就是表单中(jsp)指明提交方法后加一个 name 是 _method 的参数把想要称为的请求方式提交过来。
     * 然后虽然本质上还是post/get提交，但是可以用是spring boot一个现成的过滤器去读取这个_method并转成相应的方式。
     */

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public CITY findById(@PathVariable Integer id) {

        return serviceDao.findById(id);
    }

    @RequestMapping(value = "/insertCity", method = RequestMethod.PUT)
    public int insertCity(@RequestBody CITY city){
        CITY city1 = new CITY();
        city1.setId(6L);
        city1.setProvinceId(13L);
        city1.setCityName("makaixuan");
        city1.setDescription("mmmmmm");
        return serviceDao.insertCity(city1);
    }

    @RequestMapping(value = "/deleteCity/{id}", method = RequestMethod.DELETE)
    public int deleteCity (@PathVariable Integer id) {
        return serviceDao.deleteById(id);
    }

    @RequestMapping(value = "/getAllCities", method = RequestMethod.GET)
    public List<CITY> getAllCities() {
        return serviceDao.getCities();
    }
}
