package com.funtl.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: liuxiaoyong
 * @Date: 2019-06-05 15:26
 * @Description:
 */
@SpringBootApplication
@MapperScan(basePackages = "com.funtl.oauth2.resource.mapper")
public class Oauth2ResourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2ResourceApplication.class,args);

    }
}
