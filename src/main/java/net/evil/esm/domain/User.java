package net.evil.esm.domain;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * 用户对象
 *  用户id
 *  用户名称
 *  用户密码
 */
@Repository
public class User implements Serializable {

    private String userId;              //用户id
    private String username;            //用户名称
    private String password;            //用户密码

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
