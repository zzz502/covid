package com.liu.covid.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class States {
    private Integer id;
    private Integer greater;
    private Integer less;
    private Integer diagnosis;
    private Integer suspected;

}
