package com.liu.covid.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.liu.covid.entity.Enum.GenderEnum;
import lombok.Data;

import java.util.Date;

@Data
public class EmpIden {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String status;
    private GenderEnum sex;
    private Integer age;
    private Long idcard;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date idate;
    private String place;
    private String depart;
    private Long phonenum;

    @TableField(value = "register" ,fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date register;

    @Override
    public String toString() {
        return "EmpIden{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", idcard=" + idcard +
                ", idate=" + idate +
                ", place='" + place + '\'' +
                ", depart='" + depart + '\'' +
                ", phonenum=" + phonenum +
                ", register=" + register +
                '}';
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Long getIdcard() {
        return idcard;
    }

    public void setIdcard(Long idcard) {
        this.idcard = idcard;
    }

    public Date getIdate() {
        return idate;
    }

    public void setIdate(Date idate) {
        this.idate = idate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public Long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(Long phonenum) {
        this.phonenum = phonenum;
    }

    public Date getRegister() {
        return register;
    }

    public void setRegister(Date register) {
        this.register = register;
    }

    public EmpIden() {
    }

    public EmpIden(Long id, String name, String status, GenderEnum sex, Integer age, Long idcard, Date idate, String place, String depart, Long phonenum, Date register) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.sex = sex;
        this.age = age;
        this.idcard = idcard;
        this.idate = idate;
        this.place = place;
        this.depart = depart;
        this.phonenum = phonenum;
        this.register = register;
    }
}

