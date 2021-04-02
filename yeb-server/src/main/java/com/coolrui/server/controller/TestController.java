package com.coolrui.server.controller;

import com.coolrui.server.pojo.Employee;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.time.LocalDate;

/**
 * @Author: Coolrui
 * @Date: Created in 19:36 2021/3/23
 * @Description 测试swagger
 */

@RestController
public class TestController {
    @GetMapping("/test")
    public Object test() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("authentication："+authentication);
        return SecurityContextHolder.getContext();
    }

    @GetMapping("/employee/basic/hello")
    public String hello() {
        return "/employee/basic/hello";
    }

    @GetMapping("/employee/advanced/hello")
    public String hello2() {
        return "/employee/advanced/hello";
    }
}
