package com.xiangyun.mapper;

import com.xiangyun.model.SystemUser;

public interface SystemUserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(SystemUser record);

    int insertSelective(SystemUser record);

    SystemUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(SystemUser record);

    int updateByPrimaryKey(SystemUser record);
}