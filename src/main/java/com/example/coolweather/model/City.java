package com.example.coolweather.model;

/**
 * Created by Administrator on 2017/3/5.
 */

public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provincedId;

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public int getProvincedId() {
        return provincedId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvincedId(int provincedId) {
        this.provincedId = provincedId;
    }
}
