package io.zhijian.springpractice.inside.chapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@EnableAutoConfiguration    // 启用SpringBoot 自动装配
public class Chapter1Main {
    public static void main(String[] args){
        SpringApplication.run(Chapter1Main.class, args);
    }

    @RequestMapping("/test")
    @ResponseBody
    public Map<String, String> test() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "xiaosong");
        return map;
    }
}
