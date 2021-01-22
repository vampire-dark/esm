package net.evil.esm.controller;

import net.evil.esm.config.WxPayConfig;
import net.evil.esm.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/app/v1/video")
public class VideoController {

    @Autowired
    private WxPayConfig wxPayConfig;

    @RequestMapping("/list")
    public Object videoList(){
        Map<String,Object> videoMap = new HashMap<String,Object>();
        videoMap.put("paywx.appid",wxPayConfig.getPayWxAppid());
        videoMap.put("paywx.secret",wxPayConfig.getPayWxSecret());
        videoMap.put("paywx.mechid",wxPayConfig.getPayWxMechid());
        return JsonData.buildSuccess(videoMap);
    }
}
