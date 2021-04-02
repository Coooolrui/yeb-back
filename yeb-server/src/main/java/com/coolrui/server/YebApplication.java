package com.coolrui.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Coolrui
 * @Date: Created in 15:52 2021/3/21
 * @Description 启动类
 */
@SpringBootApplication
@MapperScan("com.coolrui.server.mapper")
public class YebApplication {
    public static void main(String[] args) {
        SpringApplication.run(YebApplication.class, args);
    }
}
