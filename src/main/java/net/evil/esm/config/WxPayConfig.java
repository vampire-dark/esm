package net.evil.esm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.Serializable;

/**
 * 微信支付配置类
 * 读取配置文件内容 config/pay_wx.properties
 */
@Configuration
@PropertySource("classpath:config/pay_wx.properties")
public class WxPayConfig implements Serializable {

    @Value("${paywx.appid}")
    private String payWxAppid;              //微信支付id
    @Value("${paywx.secret}")
    private String payWxSecret;             //微信支付密钥
    @Value("${paywx.mechid}")
    private String payWxMechid;             //微信支付商号

    public String getPayWxAppid() {
        return payWxAppid;
    }

    public void setPayWxAppid(String payWxAppid) {
        this.payWxAppid = payWxAppid;
    }

    public String getPayWxSecret() {
        return payWxSecret;
    }

    public void setPayWxSecret(String payWxSecret) {
        this.payWxSecret = payWxSecret;
    }

    public String getPayWxMechid() {
        return payWxMechid;
    }

    public void setPayWxMechid(String payWxMechid) {
        this.payWxMechid = payWxMechid;
    }
}
