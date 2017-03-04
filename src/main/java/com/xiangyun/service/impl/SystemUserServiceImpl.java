package com.xiangyun.service.impl;

import com.xiangyun.mapper.SystemUserMapper;
import com.xiangyun.model.SystemUser;
import com.xiangyun.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/3/4 0004
 * Time: 14:16
 * To change this template use File | Settings | File Templates.
 */
@Service
public class SystemUserServiceImpl implements SystemUserService {

    @Autowired
    private SystemUserMapper systemUserMapper;
    /**
     * 根据主键删除
     *
     * @param userId
     * @return
     */
    @Override
    public int deleteByPrimaryKey(String userId) {
        return systemUserMapper.deleteByPrimaryKey(userId);
    }

    /**
     * 新增
     *
     * @param record
     * @return
     */
    @Override
    public int insert(SystemUser record) {
        return systemUserMapper.insert(record);
    }

    /**
     * 非空条件新增
     *
     * @param record
     * @return
     */
    @Override
    public int insertSelective(SystemUser record) {
        return systemUserMapper.insertSelective(record);
    }

    /**
     * 根据主键查询
     *
     * @param userId
     * @return
     */
    @Override
    public SystemUser selectByPrimaryKey(String userId) {
        return systemUserMapper.selectByPrimaryKey(userId);
    }

    /**
     * 根据主键与非空条件修改
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(SystemUser record) {
        return systemUserMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键修改
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(SystemUser record) {
        return systemUserMapper.updateByPrimaryKey(record);
    }
}
