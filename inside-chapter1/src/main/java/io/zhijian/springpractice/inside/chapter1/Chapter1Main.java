package io.zhijian.springpractice.inside.chapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Chapter1Main
 * 使用 @EnableAutoConfiguration 启用SpringBoot自动装配
 *
 * @author song.z
 */
@Controller
@EnableAutoConfiguration
public class Chapter1Main {
    public static void main(String[] args){
        SpringApplication.run(Chapter1Main.class, args);
    }

    @RequestMapping("/test")
    @ResponseBody
    public Map<String, String> test() {
        Map<String, String> map = new HashMap<>(16);
        map.put("name", "xiaosong");
        return map;
    }
}
