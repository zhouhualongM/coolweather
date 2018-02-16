package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/2/16 0016.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvineName(String provinceName) {
        this.provinceName = provinceName;
    }
    public int getProvineCode(){
        return provinceCode;
    }
    public void setProvineCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
