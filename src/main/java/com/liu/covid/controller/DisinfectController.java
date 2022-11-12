package com.liu.covid.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liu.covid.entity.Appointment;
import com.liu.covid.entity.Disinfect;
import com.liu.covid.mapper.DisinfectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disinfect")
public class DisinfectController {
    @Autowired
    private DisinfectMapper mapper;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Disinfect> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Page<Disinfect> page1= new Page<>(page,size);
        Page<Disinfect> result=mapper.selectPage(page1,null);
        return result;
    }
    @GetMapping("/findById/{id}")
    public Disinfect findById(@PathVariable("id") Integer id){
        return mapper.selectById(id);
    }
}
