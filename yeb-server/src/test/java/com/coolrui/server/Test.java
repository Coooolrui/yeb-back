package com.coolrui.server;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.AntPathMatcher;

/**
 * @Author: Coolrui
 * @Date: Created in 14:00 2021/3/29
 * @Description
 */
@SpringBootTest
public class Test {
    @org.junit.jupiter.api.Test
    public void test() {
        AntPathMatcher antPathMatcher = new AntPathMatcher();
        System.out.println(antPathMatcher.match("/usrs/**", "/usr/local/tomcat"));
        System.out.println(antPathMatcher.match("/usr/{id}", "/usr/1"));
    }
}
