package com.liu.covid.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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

}

