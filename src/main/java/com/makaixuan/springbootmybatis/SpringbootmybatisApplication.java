package com.makaixuan.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.makaixuan.springbootmybatis.dao")
public class SpringbootmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisApplication.class, args);
    }

}
