package com.liu.covid.vo;

import lombok.Data;

@Data
public class PieVo {
    private String name;
    private Integer value;

    public PieVo(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public PieVo() {
    }

    @Override
    public String toString() {
        return "PieVo{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
