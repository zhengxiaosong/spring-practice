package io.zhijian.springpractice.inside.chapter1.p1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 测试控制器
 *
 * @author Song.Z
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public Map<String, String> test() {
        Map<String, String> map = new HashMap<>(16);
        map.put("name", "xiaosong");
        return map;
    }
}
