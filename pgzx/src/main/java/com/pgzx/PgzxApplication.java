package com.pgzx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pgzx.dao")
public class PgzxApplication {

    public static void main(String[] args) {
        SpringApplication.run(PgzxApplication.class, args);
    }

}

