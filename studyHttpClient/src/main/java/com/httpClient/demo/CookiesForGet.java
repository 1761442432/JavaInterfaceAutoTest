package com.httpClient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class CookiesForGet {

    private String url;
    private ResourceBundle bundle;
    private CookieStore cookiestore;

    @BeforeTest(description = "初始化")
    public void beforeTest(){
        // 定位文件。baseName为文件名（不需要后缀名properties）， Locale.CHINA 是语言
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        // 获取 test.url 的值
        url = bundle.getString("test.url");
    }

    @Test(description = "获取接口返回的cookies")
    public void cookiesForGet() throws IOException {
        String result;
        String urlGetCookies = url+bundle.getString("getCookies.uri");
        // 创建执行请求
        DefaultHttpClient client = new DefaultHttpClient();
        // 创建一个get请求
        HttpGet get = new HttpGet(urlGetCookies);
        // 执行get请求
        HttpResponse response  = client.execute(get);
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);

        // 获取cookies
        cookiestore = client.getCookieStore();
        // 获取cookies  list
        List<Cookie> cookieList = cookiestore.getCookies();
        // 遍历cookies list，获取name 和 value
        for (Cookie cookie : cookieList){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie name="+name+";   cookie value="+value);
        }
    }

    // dependsOnMethods = {"cookiesForGet"}   依赖cookiesForGet方法才能执行
    @Test(description = "需要携带cookies的get请求演示", dependsOnMethods = {"cookiesForGet"})
    public void getDemoCookiesTest() throws IOException {

        String result;
        String uriGetDemoCookies = url+bundle.getString("getDemo.Cokies.uri");
        // get请求基本写法
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet get = new HttpGet(uriGetDemoCookies);

        // 设置cookies信息
        client.setCookieStore(this.cookiestore);
        // 执行get请求，并且将返回的响应信息保存到 response
        HttpResponse response = client.execute(get);
        // 获取响应状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("获取到接口返回的状态码为："+statusCode);
        // 将结果打印
        if (statusCode == 200){
            result = EntityUtils.toString(response.getEntity());
            System.out.println(result);
        }
    }
}
