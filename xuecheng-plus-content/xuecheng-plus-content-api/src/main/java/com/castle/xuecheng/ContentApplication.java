package com.castle.xuecheng;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author YuLong
 * @Date 2023/5/6 10:38
 * @Classname ContentApplication
 * @Description 内容管理服务启动类
 */
@EnableSwagger2Doc
@SpringBootApplication
public class ContentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class, args);
    }
}
