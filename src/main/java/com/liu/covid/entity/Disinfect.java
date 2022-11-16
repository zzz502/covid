package com.liu.covid.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disinfect {
    private Integer id;
    private String area;
    private Time start;
    private Time end;
    private String articles;
    private String method;
    private String person;
    private Date date;
}
