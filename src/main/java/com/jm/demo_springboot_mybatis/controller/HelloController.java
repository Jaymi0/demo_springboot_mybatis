package com.jm.demo_springboot_mybatis.controller;

import com.jm.demo_springboot_mybatis.mapper.CountryMapper;
import com.jm.demo_springboot_mybatis.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jiaming
 * @Title: HelloController
 * @ProjectName demo_springboot_mybatis
 * @Description: TODO
 * @date 2019/8/414:19
 */
@RestController
public class HelloController {

    @Autowired
    private CountryMapper countryMapper;

    @RequestMapping("/")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/countries")
    public List<Country> countries() {

        return countryMapper.selectAll();
    }

}
