package com.liu.covid.entity;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class Disinfect {
    private Integer id;
    private String area;
    private Time start;
    private Time end;
    private String articles;
    private String method;
    private String person;
    private Date date;
    public Disinfect(Integer id, String area, Time start, Time end, String articles, String method, String person, Date date) {
        this.id = id;
        this.area = area;
        this.start = start;
        this.end = end;
        this.articles = articles;
        this.method = method;
        this.person = person;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Disinfect{" +
                "id=" + id +
                ", area='" + area + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", articles='" + articles + '\'' +
                ", method='" + method + '\'' +
                ", person='" + person + '\'' +
                ", date=" + date +
                '}';
    }

    public Disinfect() {
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

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    public String getArticles() {
        return articles;
    }

    public void setArticles(String articles) {
        this.articles = articles;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
