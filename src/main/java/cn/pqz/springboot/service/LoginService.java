package cn.pqz.springboot.service;

import cn.pqz.springboot.entities.Login;

public interface LoginService {
    public Login findLogin(String username,String password);
}
