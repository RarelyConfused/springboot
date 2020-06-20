package com.springboottest.demo.modular.study.controller;

import com.springboottest.demo.modular.config.UserNotExistsException;
import com.springboottest.demo.modular.study.model.Job;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String sayHello(String userName) {
        if (!"admin".equals(userName)) {
            throw new UserNotExistsException();
        }
        return "Hello world!";

    }

    @RequestMapping("/success")
    public String success(Model model) {
        List<Job> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Job job = new Job();
            job.setName("job" + i);
            job.setSalary(i + "1000");
            job.setType(i);
            list.add(job);
        }
        model.addAttribute("result", list);

        return "success";
    }

    @RequestMapping("/fly")
    public String fly(Model model) {
        return "project/skip";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }


    @RequestMapping("/requestLogin")
    public String requestLogin(String userName, String password, Model model, HttpSession session) {
        String msg = "用户名或密码错误";
        model.addAttribute("msg", msg);
        if (!StringUtils.isEmpty(userName) && "123456".equals(password)) {
            session.setAttribute("userName", userName);
            return "success";
        } else {
            return "login";
        }
    }
}
