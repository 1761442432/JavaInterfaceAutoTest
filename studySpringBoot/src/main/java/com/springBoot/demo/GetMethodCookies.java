package com.springBoot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

@RestController         // 表明我是需要被 Application 类扫描
public class GetMethodCookies {

    // 获取 cookies 的接口
    // 请求地， value是请求地址， method是请求方式（如下为：Get方式请求）
    @RequestMapping(value = "/getCookies", method = RequestMethod.GET)
    public String getCookies(HttpServletResponse response){

        // HttpServletResponse 装响应信息的类
        // HttpServletRequest  装请求信息的类

        // 设置cookies
        Cookie cookie = new Cookie("login", "getTrue");
        // 将响应信息中添加cookies
        response.addCookie(cookie);
        // 返回信息
        return "获取Cookies成功！";
    }

    // 需要携带 cookies 才能访问的get请求接口
    @RequestMapping(value = "/get/with/cookies", method = RequestMethod.GET)
    public String getWithCookies(HttpServletRequest request){
        // 获取请求信息中的cookie
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies)){      // 判断 cookies 对象是否为空
            return "必须携带cookies信息才能访问！";
        }
        for (Cookie cookie : cookies){          // 遍历 cookies信息，判断cookies是否正确
            if (cookie.getName().equals("login") && cookie.getValue().equals("getTrue")){
                return "携带的cookies信息正确，接口请求成功！";
            }
        }
        return "cookies信息错误，请求失败！";
    }
}
