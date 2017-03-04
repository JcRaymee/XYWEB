package com.xiangyun.controller;

import com.xiangyun.model.Student;
import com.xiangyun.service.StudentServie;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/3/4 0004
 * Time: 11:13
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class TestController {

    private Logger logger = Logger.getLogger(getClass());

    @Autowired
    private StudentServie studentServie;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        String msg = "hello spring boot";
        List<Student> students = studentServie.queryAllStudent();
        logger.info(students.size());
        return msg;
    }
}
