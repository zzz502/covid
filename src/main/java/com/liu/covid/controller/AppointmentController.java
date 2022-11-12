package com.liu.covid.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liu.covid.entity.Appointment;
import com.liu.covid.mapper.AppointmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentMapper mapper;

    //分页查询
    @GetMapping("/findAll/{page}/{size}")
    public Page<Appointment> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Page<Appointment> page1= new Page<>(page,size);
        Page<Appointment> result=mapper.selectPage(page1,null);
        return result;
    }


    @PostMapping("/save")
    public String save(@RequestBody Appointment appointment){
//        Format f = new SimpleDateFormat("yyyy-MM-dd");
//        Calendar c = Calendar.getInstance();
//        c.setTime(appointment.getBegin());
//        c.add(Calendar.DAY_OF_MONTH, 14);
//        Date end = c.getTime();
//        appointment.setEnd(end);
        int result = mapper.insert(appointment);
        if (result==1){
            return "success";
        }else {
            return "error";
        }
    }

    @GetMapping("/findById/{id}")
    public Appointment findById(@PathVariable("id") Integer id){
        return mapper.selectById(id);
    }

    @PutMapping("/update")
    public String update(@RequestBody Appointment appointment){
        Format f = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(appointment.getBegin());
        c.add(Calendar.DAY_OF_MONTH, 14);
        Date end = c.getTime();
        appointment.setEnd(end);
        int result=mapper.updateById(appointment);
        if (result==1){
            return "success";
        }else {
            return "error";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id")Long id){
        mapper.deleteById(id);
    }

    @GetMapping("/search/{searchkey}/{stext}")
    public List<Appointment> search(@PathVariable("searchkey")String searchkey, @PathVariable("stext")String stext){
        QueryWrapper<Appointment> userQueryWrapper = Wrappers.query();
        userQueryWrapper.like(searchkey,stext);
        return mapper.selectList(userQueryWrapper);
    }
}
