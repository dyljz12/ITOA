package com.lz.itoa.controller;


import com.lz.itoa.dao.UserMapper;
import com.lz.itoa.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "测试接口")
@Slf4j
@RestController
public class HelloController {
    @Autowired
    private UserMapper userMapper;

    @ApiOperation(value = "获取用户", notes="获取用户详细信息")
    @ApiImplicitParam(name = "telephone", value = "电话号码", paramType = "query", required = true, dataType = "Integer")
    @GetMapping("/hello")
    public List<User> hello() {
        List<User> users = userMapper.selectAll();
        return users;
    }
    @GetMapping("/admin")
    public String admin() {
        return "hello admin !";
    }
}
