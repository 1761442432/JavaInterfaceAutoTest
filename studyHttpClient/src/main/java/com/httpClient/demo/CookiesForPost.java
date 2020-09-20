package com.httpClient.demo;

import com.google.gson.JsonObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class CookiesForPost {

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

    @Test(description = "需要携带cookies、header已经body的post请求演示", dependsOnMethods = {"cookiesForGet"})
    public void postDemoCookiesTest() throws IOException {

        // 拼接 url 地址
        String uriPostDemoCookies = url+bundle.getString("postDemo.Cookies.uri");
        // 创建一个执行请求的方法
        DefaultHttpClient client = new DefaultHttpClient();
        // 创建post方法请求
        HttpPost post = new HttpPost(uriPostDemoCookies);
        // 设置 header（请求头） 信息
        post.setHeader("content-type", "application/json");   // 可以使用多个setHeader()方法设置多个header
        // 设置body参数
        JSONObject param = new JSONObject();
        param.put("name", "zhangsan");
        param.put("age", "18");
        StringEntity entity = new StringEntity(param.toString(), "utf-8");  // 将 json类型的数据格式化
        post.setEntity(entity);  // 设置body参数
        // 设置cookies
        client.setCookieStore(this.cookiestore);
        // 执行post请求
        HttpResponse response = client.execute(post);
        // 获取结果
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
        // 将结果转换为JSON类型
        JSONObject resultJson = new JSONObject(result);
        String zhangsan = (String) resultJson.get("zhangsan");   // 将get返回的Object类型强制转换为 String 类型
        String status = (String) resultJson.get("status");
        // 断言，判断结果是否符合预期
        Assert.assertEquals(zhangsan, "success");       // actual 实际，  expected 预期
        Assert.assertEquals(status, "1");
    }
}
