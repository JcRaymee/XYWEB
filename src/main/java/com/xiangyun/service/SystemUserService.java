package com.xiangyun.service;

import com.xiangyun.model.SystemUser;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/3/4 0004
 * Time: 14:09
 * To change this template use File | Settings | File Templates.
 */
public interface SystemUserService {
    /**
     * 根据主键删除
     * @param userId
     * @return
     */
    int deleteByPrimaryKey(String userId);

    /**
     * 新增
     * @param record
     * @return
     */
    int insert(SystemUser record);

    /**
     * 非空条件新增
     * @param record
     * @return
     */
    int insertSelective(SystemUser record);

    /**
     * 根据主键查询
     * @param userId
     * @return
     */
    SystemUser selectByPrimaryKey(String userId);

    /**
     * 根据主键与非空条件修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SystemUser record);

    /**
     * 根据主键修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(SystemUser record);
}
