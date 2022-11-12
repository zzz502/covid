package com.liu.covid.entity;

import lombok.Data;

@Data
public class States {
    private Integer id;
    private Integer greater;
    private Integer less;
    private Integer diagnosis;
    private Integer suspected;

    public States(Integer id, Integer greater, Integer less, Integer diagnosis, Integer suspected) {
        this.id = id;
        this.greater = greater;
        this.less = less;
        this.diagnosis = diagnosis;
        this.suspected = suspected;
    }

    public States() {
    }

    @Override
    public String toString() {
        return "States{" +
                "id=" + id +
                ", greater=" + greater +
                ", less=" + less +
                ", diagnosis=" + diagnosis +
                ", suspected=" + suspected +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGreater() {
        return greater;
    }

    public void setGreater(Integer greater) {
        this.greater = greater;
    }

    public Integer getLess() {
        return less;
    }

    public void setLess(Integer less) {
        this.less = less;
    }

    public Integer getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Integer diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Integer getSuspected() {
        return suspected;
    }

    public void setSuspected(Integer suspected) {
        this.suspected = suspected;
    }
}
