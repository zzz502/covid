package com.liu.covid.entity;

import lombok.Data;

@Data
public class Local {
    private Integer id;
    private String area;
    private Integer per;
    private Integer pers;
    private Integer perso;
    private Integer person;

    @Override
    public String toString() {
        return "Local{" +
                "id=" + id +
                ", area='" + area + '\'' +
                ", per=" + per +
                ", pers=" + pers +
                ", perso=" + perso +
                ", person=" + person +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getPer() {
        return per;
    }

    public void setPer(Integer per) {
        this.per = per;
    }

    public Integer getPers() {
        return pers;
    }

    public void setPers(Integer pers) {
        this.pers = pers;
    }

    public Integer getPerso() {
        return perso;
    }

    public void setPerso(Integer perso) {
        this.perso = perso;
    }

    public Integer getPerson() {
        return person;
    }

    public void setPerson(Integer person) {
        this.person = person;
    }

    public Local() {
    }

    public Local(Integer id, String area, Integer per, Integer pers, Integer perso, Integer person) {
        this.id = id;
        this.area = area;
        this.per = per;
        this.pers = pers;
        this.perso = perso;
        this.person = person;
    }
}
