package com.liu.covid.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.liu.covid.entity.Enum.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
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


}
