package com.tan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author TWH
 * @date 2022/7/11 18:43
 */
@SpringBootApplication
@MapperScan(basePackages = "com/tan/mapper")
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class);
    }
}
