package com.lz.itoa.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class HelloController {
    @Autowired
    private TCourseMapper tCourseMapper;
    @GetMapping("/hello")
    public List<TCourse> hello() {
        List<TCourse> t_course = tCourseMapper.selectAll();
        return t_course;
    }
    @GetMapping("/admin")
    public String admin() {
        return "hello admin !";
    }
}
