package cn.pqz.springboot.dao;

import cn.pqz.springboot.entities.Login;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {
    public Login findLogin( String username, String password);
}
