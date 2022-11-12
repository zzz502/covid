package com.liu.covid.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liu.covid.entity.Appointment;
import com.liu.covid.entity.User;
import com.liu.covid.mapper.AppointmentMapper;
import com.liu.covid.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper mapper;

    //分页查询
    @GetMapping("/findAll/{page}/{size}")
    public Page<User> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Page<User> page1= new Page<>(page,size);
        Page<User> result=mapper.selectPage(page1,null);
        return result;
    }


    @PostMapping("/save")
    public String save(@RequestBody User user){
//        Format f = new SimpleDateFormat("yyyy-MM-dd");
//        Calendar c = Calendar.getInstance();
//        c.setTime(appointment.getBegin());
//        c.add(Calendar.DAY_OF_MONTH, 14);
//        Date end = c.getTime();
//        appointment.setEnd(end);
        int result = mapper.insert(user);
        if (result==1){
            return "success";
        }else {
            return "error";
        }
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id){
        return mapper.selectById(id);
    }

    @PutMapping("/update")
    public String update(@RequestBody User user){
        Format f = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
//        c.setTime(user.getBegin());
//        c.add(Calendar.DAY_OF_MONTH, 14);
//        Date end = c.getTime();
//        appointment.setEnd(end);
        int result=mapper.updateById(user);
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
    public List<User> search(@PathVariable("searchkey")String searchkey, @PathVariable("stext")String stext){
        QueryWrapper<User> userQueryWrapper = Wrappers.query();
        userQueryWrapper.like(searchkey,stext);
        return mapper.selectList(userQueryWrapper);
    }
}
