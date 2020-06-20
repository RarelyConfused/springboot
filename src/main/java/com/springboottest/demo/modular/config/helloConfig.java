package com.springboottest.demo.modular.config;

import com.springboottest.demo.modular.common.MyLocalResolver;
import com.springboottest.demo.modular.study.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class helloConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("加载helloService到容器中");
        return  new HelloService();
    }

    @Bean
    public LocaleResolver localeResolver(){
        System.out.println("localeResolver");
        return  new MyLocalResolver();
    }

   /* @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return  new MySpringMvcConfig();
    }*/
}
