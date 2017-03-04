package com.xiangyun.controller;

import com.xiangyun.model.SystemUser;
import com.xiangyun.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/3/4 0004
 * Time: 14:18
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/user")
public class SystemUserController {

    @Autowired
    private SystemUserService systemUserService;
    private SimpleDateFormat sdf;

    @RequestMapping("/add")
    @ResponseBody
    public String add() throws ParseException {
        String msg = "";
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        SystemUser systemUser = new SystemUser();
        systemUser.setUserId("first");
        systemUser.setUserName("raymee");
        systemUser.setUserAge((short)30);
        systemUser.setUserBirth(sdf.parse("1987-01-01"));
        systemUser.setCreateTime(new Date());
        int result = systemUserService.insertSelective(systemUser);
        return "成功新增"+result+"个用户";
    }
}
