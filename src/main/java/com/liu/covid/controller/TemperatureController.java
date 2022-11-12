package com.liu.covid.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liu.covid.entity.EmpIden;
import com.liu.covid.entity.Temperature;
import com.liu.covid.mapper.EmpIdenMapper;
import com.liu.covid.mapper.TemperatureMapper;
import com.liu.covid.service.ChartService;
import com.liu.covid.vo.LineVO;
import com.liu.covid.vo.PieVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/temperature")
public class TemperatureController {
    @Autowired
    private ChartService chartService;
    @Autowired
    private TemperatureMapper mapper;

    //分页查询
    @GetMapping("/findAll/{page}/{size}")
    public Page<Temperature> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Page<Temperature> page1= new Page<>(page,size);
        Page<Temperature> result=mapper.selectPage(page1,null);
        return result;
    }


    @PostMapping("/save")
    public String save(@RequestBody Temperature temperature){
        int result = mapper.insert(temperature);
        if (result==1){
            return "success";
        }else {
            return "error";
        }
    }

    @GetMapping("/LineVO")
    public LineVO getLineVO(){
        return this.chartService.lineVOList();
    }
    @GetMapping("/PieVO")
    public List<PieVo> getPieVO(){
        return this.chartService.pieVOMap();
    }
    @GetMapping("/findById/{id}")
    public Temperature findById(@PathVariable("id") Integer id){
        return mapper.selectById(id);
    }

    @PutMapping("/update")
    public String update(@RequestBody Temperature temperature){

        int result=mapper.updateById(temperature);
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
    public List<Temperature> search(@PathVariable("searchkey")String searchkey, @PathVariable("stext")String stext){
        QueryWrapper<Temperature> userQueryWrapper = Wrappers.query();
        userQueryWrapper.like(searchkey,stext);
        return mapper.selectList(userQueryWrapper);
    }
}

