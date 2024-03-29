package cn.pqz.springboot.controller;

import cn.pqz.springboot.entities.Login;
import cn.pqz.springboot.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @GetMapping(value = "/user/login")
    public String toLogin()
    {
        return "login";
    }
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model,HttpSession session){
        Login login=loginService.findLogin(username,password);
        if (login!=null)
        {
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }
        else {
            model.addAttribute("msg","账号或密码错误");
            return "login";
        }

    }
}
