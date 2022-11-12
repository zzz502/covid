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
public class EmpHealth {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String title;
    private String content;
    @TableField(value = "createTime" ,fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;
}
