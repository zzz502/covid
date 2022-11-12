package com.liu.covid.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liu.covid.entity.Disinfect;
import com.liu.covid.entity.State;
import com.liu.covid.mapper.DisinfectMapper;
import com.liu.covid.mapper.StateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/state")
public class StateController {
    @Autowired
    private StateMapper mapper;

    @GetMapping("/findAll/{page}/{size}")
    public Page<State> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Page<State> page1= new Page<>(page,size);
        Page<State> result=mapper.selectPage(page1,null);
        return result;
    }
    @GetMapping("/findById/{id}")
    public State findById(@PathVariable("id") Integer id){
        return mapper.selectById(id);
    }
}
