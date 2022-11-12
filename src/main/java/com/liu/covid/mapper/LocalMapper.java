package com.liu.covid.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liu.covid.entity.Local;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface LocalMapper extends BaseMapper<Local> {
}
