package com.httpClient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class HttpClientBase_01 {

    @Test
    public void httpClientBase_01() throws IOException {

        // 用来存放结果
        String result;
        // 用来执行请求
        DefaultHttpClient client = new DefaultHttpClient();
        // 创建一个get请求
        HttpGet get = new HttpGet("http://www.baidu.com");
        // 执行get请求，并且保存响应结果
        HttpResponse response = client.execute(get);
        // 并且将结果转换为字符串类型
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
    }
}
