package com.liu.covid.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liu.covid.entity.Disinfect;
import com.liu.covid.entity.Local;
import com.liu.covid.mapper.DisinfectMapper;
import com.liu.covid.mapper.LocalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/local")
public class LocalController {
    @Autowired
    private LocalMapper mapper;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Local> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Page<Local> page1= new Page<>(page,size);
        Page<Local> result=mapper.selectPage(page1,null);
        return result;
    }
    @GetMapping("/findById/{id}")
    public Local findById(@PathVariable("id") Integer id){
        return mapper.selectById(id);
    }
}
