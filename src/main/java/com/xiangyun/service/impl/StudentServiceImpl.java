package com.xiangyun.service.impl;

import com.xiangyun.exception.StudentException;
import com.xiangyun.mapper.StudentMapper;
import com.xiangyun.model.Student;
import com.xiangyun.service.StudentServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/3/4 0004
 * Time: 12:48
 * To change this template use File | Settings | File Templates.
 */
@Service
public class StudentServiceImpl implements StudentServie{
    @Autowired
    private StudentMapper studentMapper;


    /**
     * 查询所有学生信息
     *
     * @return 学生对象集合
     * @throws StudentException
     */
    @Override
    public List<Student> queryAllStudent(){
        List<Student> students = studentMapper.queryAllStudent();
        return students;
    }
}
