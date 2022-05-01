package io.zhijian.springpractice.inside.chapter1.p1;

import io.zhijian.springpractice.inside.chapter1.p1.controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Description: 项目启动类
 *
 * @author Song.Z
 */
@EnableAutoConfiguration
public class Practice1Application {
    public static void main(String[] args) {
        SpringApplication.run(
                new Class[]{
                        Practice1Application.class,
                        TestController.class
                }, args);
    }
}
