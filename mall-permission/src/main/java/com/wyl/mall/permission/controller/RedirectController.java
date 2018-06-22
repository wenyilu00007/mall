package com.wyl.mall.permission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
* @Title: RedirectController 
* @Package com.hoau.leo.business.controller 
* @Description: 
* @author 陈宇霖  
* @date 2017/8/28 23:48
* @version V1.0   
*/
@Controller
@RequestMapping("/redirect")
public class RedirectController {

    @Autowired
    private Environment environment;

    @RequestMapping("")
    public void redirect(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect(environment.getProperty("zodiac.cas.client.fontMainPageUrl"));
    }
}
