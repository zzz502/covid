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
public class Waste {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String type;
    private String weight;
    private String num;
    private String mode;
    private String handle;
    private String supervise;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date idate;
    @TableField(value = "register" ,fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date register;

    public Waste() {
    }

    @Override
    public String toString() {
        return "Waste{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", weight='" + weight + '\'' +
                ", num='" + num + '\'' +
                ", mode='" + mode + '\'' +
                ", handle='" + handle + '\'' +
                ", supervise='" + supervise + '\'' +
                ", idate=" + idate +
                ", register=" + register +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getSupervise() {
        return supervise;
    }

    public void setSupervise(String supervise) {
        this.supervise = supervise;
    }

    public Date getIdate() {
        return idate;
    }

    public void setIdate(Date idate) {
        this.idate = idate;
    }

    public Date getRegister() {
        return register;
    }

    public void setRegister(Date register) {
        this.register = register;
    }

    public Waste(Long id, String type, String weight, String num, String mode, String handle, String supervise, Date idate, Date register) {
        this.id = id;
        this.type = type;
        this.weight = weight;
        this.num = num;
        this.mode = mode;
        this.handle = handle;
        this.supervise = supervise;
        this.idate = idate;
        this.register = register;
    }
}

