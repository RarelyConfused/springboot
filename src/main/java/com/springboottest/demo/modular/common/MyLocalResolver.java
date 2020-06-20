package com.springboottest.demo.modular.common;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocalResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String lang =httpServletRequest.getParameter("lang");
        Locale locale =Locale.getDefault();
        if(!StringUtils.isEmpty(lang)){
           String[] arr = lang.split("_");
            locale = new Locale(arr[0],arr[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
