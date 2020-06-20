package com.springboottest.demo;

import com.springboottest.demo.modular.study.model.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.trace("trace啦啦啦");
        logger.debug("debug略略略");
        logger.warn("warn啦啦啦");
    }

}
