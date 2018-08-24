package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:
 * User: huangchengdu
 * Date: 2018-08-24
 * Time: 上午7:47
 */

/**
 * SpringBootApplication来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args){
        //spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
