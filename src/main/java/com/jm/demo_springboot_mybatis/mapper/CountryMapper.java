package com.jm.demo_springboot_mybatis.mapper;

import com.jm.demo_springboot_mybatis.model.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author jiaming
 * @Title: CountryMapper
 * @ProjectName demo_springboot_mybatis
 * @Description: TODO
 * @date 2019/8/414:24
 */
@Mapper
public interface CountryMapper {

    /**
     * 查询全部
     * @return
     */
    List<Country> selectAll();
}
