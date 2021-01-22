package net.evil.esm.serivce.impl;


import net.evil.esm.domain.User;
import net.evil.esm.serivce.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户对象服务层实现类
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 登录方法，判断用户名或者密码是否正确
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        if(user == null ){
            return null;
        }
        if("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())){
            return user;
        }
        return null;
    }
}
