package com.lz.itoa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lz.itoa.dao")
@SpringBootApplication
public class ItoaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItoaApplication.class, args);
    }

}
