package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 胡政宇 on 2018-08-28.
 */
@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class CmfzApplication {
    public static void main(String[] args) {
        SpringApplication.run(CmfzApplication.class,args);
    }
}
