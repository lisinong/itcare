package com.alexli.cstraining.mapper;

import com.alexli.cstraining.model.Hosp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface HospMapper extends BaseMapper<Hosp> {
    int deleteByPrimaryKey(Integer hospId);

    int insert(Hosp record);

    int insertSelective(Hosp record);

    Hosp selectByPrimaryKey(Integer hospId);

    int updateByPrimaryKeySelective(Hosp record);

    int updateByPrimaryKey(Hosp record);
}