package com.lz.itoa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.lz.itoa.dao")
@SpringBootApplication
public class ItoaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItoaApplication.class, args);
    }

}
