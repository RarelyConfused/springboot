package com.springboottest.demo.modular.study.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;

@Component
//@PropertySource(value = "classpath:application.properties")   
//哈哈哈
@ConfigurationProperties(prefix = "person")
@Data
public class Person {

    private String name;

    private String dog;

    private Map<String,Object> map;

    private List<String> list ;
}
