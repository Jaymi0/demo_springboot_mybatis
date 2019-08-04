package com.jm.demo_springboot_mybatis.model;

/**
 * @author jiaming
 * @Title: Country
 * @ProjectName demo_springboot_mybatis
 * @Description: TODO
 * @date 2019/8/414:23
 */
public class Country {
    private Long id;
    private String countryName;
    private String countryCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
