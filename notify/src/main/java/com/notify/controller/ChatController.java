package com.notify.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class ChatController {

    /**
     * 登陆界面
     */
//    @GetMapping("/")
    public ModelAndView login() {
        return new ModelAndView("/login");
    }

    /**
     * 聊天界面
     */
//    @GetMapping("/index")
    public ModelAndView index(String username, String password, HttpServletRequest request) throws UnknownHostException {
        if (StringUtils.isEmpty(username)) {
            username = "匿名用户";
        }
        System.err.println("登入用戶" + username);
        ModelAndView mav = new ModelAndView("/chat");
        mav.addObject("username", username);
        mav.addObject("webSocketUrl", "ws://"+InetAddress.getLocalHost().getHostAddress()+":"+request.getServerPort()+request.getContextPath()+"/chat");
        System.out.println("ws://"+InetAddress.getLocalHost().getHostAddress()+":"+request.getServerPort()+request.getContextPath()+"/chat");
        return mav;
    }

}
