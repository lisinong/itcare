package com.alexli.cstraining.mapper;

import com.alexli.cstraining.model.Escort;

public interface EscortMapper {
    int deleteByPrimaryKey(Integer escortId);

    int insert(Escort record);

    int insertSelective(Escort record);

    Escort selectByPrimaryKey(Integer escortId);

    int updateByPrimaryKeySelective(Escort record);

    int updateByPrimaryKey(Escort record);
}