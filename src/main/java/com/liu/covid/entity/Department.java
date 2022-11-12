package com.liu.covid.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Department {
    @TableId
    private Integer id;
    private String name;
    private String charge;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", charge='" + charge + '\'' +
                '}';
    }

    public Department() {
    }

    public Department(Integer id, String name, String charge) {
        this.id = id;
        this.name = name;
        this.charge = charge;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }
}
