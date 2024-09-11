package com.alexli.cstraining.mapper;

import com.alexli.cstraining.model.DrugOrder;

public interface DrugOrderMapper {
    int deleteByPrimaryKey(Integer doId);

    int insert(DrugOrder record);

    int insertSelective(DrugOrder record);

    DrugOrder selectByPrimaryKey(Integer doId);

    int updateByPrimaryKeySelective(DrugOrder record);

    int updateByPrimaryKey(DrugOrder record);
}