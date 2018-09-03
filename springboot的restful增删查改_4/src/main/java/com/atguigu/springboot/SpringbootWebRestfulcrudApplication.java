package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

@SpringBootApplication
public class SpringbootWebRestfulcrudApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootWebRestfulcrudApplication.class, args);
    }

    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

    private static class MyViewResolver implements ViewResolver{

        @java.lang.Override
        public View resolveViewName(java.lang.String s, java.util.Locale locale) throws Exception {
            return null;
        }
    }
}
