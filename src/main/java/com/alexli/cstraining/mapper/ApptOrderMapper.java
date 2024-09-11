package com.alexli.cstraining.mapper;

import com.alexli.cstraining.model.ApptOrder;

public interface ApptOrderMapper {
    int deleteByPrimaryKey(Integer aoId);

    int insert(ApptOrder record);

    int insertSelective(ApptOrder record);

    ApptOrder selectByPrimaryKey(Integer aoId);

    int updateByPrimaryKeySelective(ApptOrder record);

    int updateByPrimaryKey(ApptOrder record);
}