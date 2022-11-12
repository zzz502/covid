package com.liu.covid.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.liu.covid.entity.Enum.ImpEnum;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "material_manage")
public class MaterialManage {


    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private int count;
    private String type;
    @TableField(value = "isImp")
    private ImpEnum isImp;
    private String charge;
    private Long cnum;
    @TableField(value = "updateTime" ,fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;

    public MaterialManage(Long id, String name, int count, String type, ImpEnum isImp, String charge, Long cnum, Date updateTime) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.type = type;
        this.isImp = isImp;
        this.charge = charge;
        this.cnum = cnum;
        this.updateTime = updateTime;
    }

    public MaterialManage() {
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ImpEnum getIsImp() {
        return isImp;
    }

    public void setIsImp(ImpEnum isImp) {
        this.isImp = isImp;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public Long getCnum() {
        return cnum;
    }

    public void setCnum(Long cnum) {
        this.cnum = cnum;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "MaterialManage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", type='" + type + '\'' +
                ", isImp=" + isImp +
                ", charge='" + charge + '\'' +
                ", cnum=" + cnum +
                ", updateTime=" + updateTime +
                '}';
    }
}
