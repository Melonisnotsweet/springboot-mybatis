package cn.pqz.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Arrays;


@Controller
public class HelloWorld {
    @RequestMapping("/hello")
    @ResponseBody
    public String Hello()
    {
        return "hello world!";
    }
    @RequestMapping("/success")
    public String success(Model model)
    {
        model.addAttribute("msg","<h1>hello<h1/>");
        model.addAttribute("users",Arrays.asList("zhangsan","lisi"));
        return "success";
    }

}
