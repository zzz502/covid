package com.liu.covid.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liu.covid.entity.State;
import com.liu.covid.entity.States;
import com.liu.covid.mapper.StateMapper;
import com.liu.covid.mapper.StatesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StatesController {
    @Autowired
    private StatesMapper mapper;

    @GetMapping("/findAll/{page}/{size}")
    public Page<States> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Page<States> page1= new Page<>(page,size);
        Page<States> result=mapper.selectPage(page1,null);
        return result;
    }
    @GetMapping("/findById/{id}")
    public States findById(@PathVariable("id") Integer id){
        return mapper.selectById(id);
    }
}
