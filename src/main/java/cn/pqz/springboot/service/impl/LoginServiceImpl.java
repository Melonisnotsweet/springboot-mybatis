package cn.pqz.springboot.service.impl;

import cn.pqz.springboot.dao.LoginDao;
import cn.pqz.springboot.entities.Login;
import cn.pqz.springboot.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;
    public Login findLogin(String username,String password){
        Login login=loginDao.findLogin(username,password);
        return login;
    }
}
