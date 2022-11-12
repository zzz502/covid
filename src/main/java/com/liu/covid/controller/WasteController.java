package com.liu.covid.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liu.covid.entity.EmpIden;
import com.liu.covid.entity.Waste;
import com.liu.covid.mapper.EmpIdenMapper;
import com.liu.covid.mapper.WasteMapper;
import com.liu.covid.service.ChartService;
import com.liu.covid.vo.LineVO;
import com.liu.covid.vo.PieVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/waste")
public class WasteController {
    @Autowired
    private ChartService chartService;
    @Autowired
    private WasteMapper mapper;

    //分页查询
    @GetMapping("/findAll/{page}/{size}")
    public Page<Waste> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Page<Waste> page1= new Page<>(page,size);
        Page<Waste> result=mapper.selectPage(page1,null);
        return result;
    }


    @PostMapping("/save")
    public String save(@RequestBody Waste empIden){
        int result = mapper.insert(empIden);
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
    public Waste findById(@PathVariable("id") Integer id){
        return mapper.selectById(id);
    }

    @PutMapping("/update")
    public String update(@RequestBody Waste empIden){

        int result=mapper.updateById(empIden);
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
    public List<Waste> search(@PathVariable("searchkey")String searchkey, @PathVariable("stext")String stext){
        QueryWrapper<Waste> userQueryWrapper = Wrappers.query();
        userQueryWrapper.like(searchkey,stext);
        return mapper.selectList(userQueryWrapper);
    }
}

