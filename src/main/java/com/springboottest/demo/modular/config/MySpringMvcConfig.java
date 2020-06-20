package com.springboottest.demo.modular.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

//
@Configuration
//@EnableWebMvc 不要接管springmvc
public class MySpringMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//                super.addViewControllers(registry);
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/").setViewName("login");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        super.addInterceptors(registry);                          //拦截所有请求                                        //过滤静态资源
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html", "/", "/login","/login.html","/requestLogin","/img/*");
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("配置不拦截静态资源");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
