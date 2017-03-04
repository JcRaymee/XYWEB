package com.xiangyun.mapper;

import com.xiangyun.model.Student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/3/4 0004
 * Time: 12:39
 * To change this template use File | Settings | File Templates.
 */
public interface StudentMapper {
    /**
     * 查询所有学生信息
     * @return 学生信息集合
     */
    List<Student> queryAllStudent();
}
