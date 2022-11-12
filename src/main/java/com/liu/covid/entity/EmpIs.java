package com.liu.covid.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.liu.covid.entity.Enum.GenderEnum;
import lombok.Data;

import java.util.Date;

@Data
public class EmpIs {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private GenderEnum sex;
    private Integer age;
    private Long phone;
    private float temp;
    private String type;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date begin;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private  Date end;
    private String content;
    private String depart;

    @Override
    public String toString() {
        return "EmpIs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", phone=" + phone +
                ", temp=" + temp +
                ", type='" + type + '\'' +
                ", begin=" + begin +
                ", end=" + end +
                ", content='" + content + '\'' +
                ", depart='" + depart + '\'' +
                '}';
    }

    public EmpIs() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderEnum getSex() {
        return sex;
    }

    public void setSex(GenderEnum sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public EmpIs(Long id, String name, GenderEnum sex, Integer age, Long phone, float temp, String type, Date begin, Date end, String content, String depart) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.temp = temp;
        this.type = type;
        this.begin = begin;
        this.end = end;
        this.content = content;
        this.depart = depart;
    }
}
