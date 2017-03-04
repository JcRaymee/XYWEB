package com.xiangyun.model;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/3/4 0004
 * Time: 12:38
 * To change this template use File | Settings | File Templates.
 */
public class Student implements Serializable {
    private String studentId;
    private String studentName;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
