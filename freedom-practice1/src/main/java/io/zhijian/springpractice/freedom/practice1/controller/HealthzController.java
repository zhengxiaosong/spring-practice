package io.zhijian.springpractice.freedom.practice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *  健康检测api
 *
 * @author Song.Z
 */
@RestController
public class HealthzController {

    /**
     * 通过 <a href="http://localhost:8080/healthz/">http://localhost:8080/healthz/</a> 访问
     *
     * @return "ok"
     */
    @GetMapping("/healthz")
    public String healthz() {
        return "ok";
    }
}
