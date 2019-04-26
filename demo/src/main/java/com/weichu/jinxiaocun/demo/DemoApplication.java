package com.weichu.jinxiaocun.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.weichu.jinxiaocun.demo.mapper")
public class DemoApplication {

    public static void main(String[] args)
    {
        System.out.println("123");
        System.out.println("3333");
        SpringApplication.run(DemoApplication.class, args);
    }

}
