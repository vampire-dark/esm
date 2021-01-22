package net.evil.esm.controller;

import net.evil.esm.domain.User;
import net.evil.esm.serivce.UserService;
import net.evil.esm.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户对象控制层
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    /**
     * 用户对象服务层实例
     */
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public JsonData login(@RequestBody User user){

        User userLogin = userService.login(user);
        System.out.print(userLogin);
        return userLogin != null ? JsonData.buildSuccess(userLogin) : JsonData.buildError("账号或密码错误",-1);

    }
}
