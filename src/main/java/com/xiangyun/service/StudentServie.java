package com.xiangyun.service;

import com.xiangyun.exception.StudentException;
import com.xiangyun.model.Student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/3/4 0004
 * Time: 12:45
 * To change this template use File | Settings | File Templates.
 */
public interface StudentServie {
    /**
     * 查询所有学生信息
     * @return 学生对象集合
     * @throws StudentException
     */
    List<Student> queryAllStudent();
}
