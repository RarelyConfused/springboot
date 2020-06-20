package com.springboottest.demo.modular.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 异常处理器
 */
@ControllerAdvice
public class MyExceptionHandler {
    /**
     * 浏览器服务器都返回json
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(UserNotExistsException.class)
    public Map<String,Object>  handlerException(Exception e){
        Map<String,Object> map =new HashMap<>();
        map.put("code","userNotExists");
        map.put("message",e.getMessage());
        return  map;
    }
}
