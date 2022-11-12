package com.liu.covid.entity;

import lombok.Data;

@Data
public class State {
    private Integer id;
    private Integer june;
    private Integer july;
    private Integer august;
    private Integer september;
    private Integer october;
    private Integer november;

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", june=" + june +
                ", july=" + july +
                ", august=" + august +
                ", september=" + september +
                ", october=" + october +
                ", november=" + november +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJune() {
        return june;
    }

    public void setJune(Integer june) {
        this.june = june;
    }

    public Integer getJuly() {
        return july;
    }

    public void setJuly(Integer july) {
        this.july = july;
    }

    public Integer getAugust() {
        return august;
    }

    public void setAugust(Integer august) {
        this.august = august;
    }

    public Integer getSeptember() {
        return september;
    }

    public void setSeptember(Integer september) {
        this.september = september;
    }

    public Integer getOctober() {
        return october;
    }

    public void setOctober(Integer october) {
        this.october = october;
    }

    public Integer getNovember() {
        return november;
    }

    public void setNovember(Integer november) {
        this.november = november;
    }

    public State() {
    }

    public State(Integer id, Integer june, Integer july, Integer august, Integer september, Integer october, Integer november) {
        this.id = id;
        this.june = june;
        this.july = july;
        this.august = august;
        this.september = september;
        this.october = october;
        this.november = november;
    }
}
