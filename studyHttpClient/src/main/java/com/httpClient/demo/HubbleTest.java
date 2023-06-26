package com.httpClient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;

/**
 * @Author zhongxiaoxiong
 * @Description
 * @Date 1/26/23
 */
public class HubbleTest {

    @Test(description = "编写一个基本post请求")
    public void chuxingTest() throws Exception{

        // 需要访问的接口地址
        String url = "https://hubble-test.yueyuechuxing.cn/dockingApi/v1/admin/invoker/carpoolTravelRService_queryCarpoolTravelList";

        //先创建一个http客户端对象
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient();

        //然后创建一个Post请求对象,并且将url传递给Post请求
        HttpPost httpPost = new HttpPost(url);


        //使用Post对象设置Header
        httpPost.setHeader("_admin_eid", "-1");
        httpPost.setHeader("_admin_sign", "76828b6260c0588b86dff532333faab9");
        httpPost.setHeader("_admin_ts", "1674716820");
        httpPost.setHeader("accept", "application/json, text/plain, */*");
        httpPost.setHeader("content-type", "application/json");
        httpPost.setHeader("Cookie", "user=cFZJsqR526l2Vxp4geKb5PkbsQIs3sx/D1HGh6fVSYf46Q/QizuwkZnSYqUCuoawZhoNBpAMRXbjc2yMUAhMp49ugqCc7nfAIoP8mkijoy5wjUQ8BUSup55nggP8wKGL/Sa5URn/q8N2lHmIsp5hQqJMSZrrAC5tC+PjM3rXhH42n5mV+pzUReDulyhWdIwDoz5J08/1n9ZW6CuUV8o5ofMv1s/Dx0taUB2fVmwt/8DLvYBB78KJowaL9iE3Q6ythaeepva8o2m3WZn4RhTP2AllQrJx3dJDQAnO4BrFsyg4HPGFpda0h6BVCx1OmL1duZ/vVXgr6q3MsYGeKp3QfiQY44lgnHJBgd6LIn8x74+j4/YzFunEYE+FXyabRuxRYqTwNFKRysEfxoEL9DXKwLKTukIo646F95q2IF8YsEhv/vgHBLwq9GOZfqLrf6+6uwwUlwMg/M/iW19USjaks3I+gynBFdg0WuvqP7NqVpiuHrY5QFeOCyUY9qddEF3KNRVRhk5LonXGqTbOMK819oEveSgySXJVP83iSt30qkZa6El/UZcMikyy/6E2bp9wtirgPPGPzaZ9mvaj/ffBTKsvcFsxO8BmhzNUYP0Yp4DMSv5I77X+12lMpUR42kgyrZ7gUma5GFSw1PyqrDJg1DpP/aRMkqFvcrQIwpwTTU6N5NoSLvR0nqDXeinCzPJaYJ0DimPpX+8xkSvW8O8yWAQ8GUpHSZwkSTMwlCKgUYWWmt4vcBD3vOgniZrB/VUHsGlc5fcnBTLAfzGDRbDgdO91ulu/9jcLsHZ1xsJ9oYBn0KRAhFQ+bMjCVFq2OFzQWdjqwxeEBaCpd5UUoB0MjzXnkIO1h6jgx7GN51ve1SfYLfLvME9Wa5SjTtfSB7FeAJKNL7KnN+rfc0eUAYhAXsXaouk5gtgNmh/cq8KW82zPNTQJhN7OkIpFj53LjPdXD92M/sXs49+bx/e9nRVepb8nsYb/gqtT8u/68deka0pAtGGbIvzdjPZaPefBbyOk; token=a1ce6a50cf8f45dc97af06a7fd71083c");

        //使用httpClient对象设置cookies  （这行代码注释了，直接在 Header 中设置cookies也可以）
//        defaultHttpClient.setCookieStore();

        // 将body体添加到post请求中
        JSONObject object = new JSONObject();
        object.put("driverMobile", "15570000976");
        object.put("startDateTime", "2023-01-26 00:00:00");
        object.put("endDateTime", "2023-01-26 23:59:59");
        object.put("queryType", 1050);
        object.put("pageNum", 1);
        object.put("pageSize", 10);

        // 将JSON对象格式化
        StringEntity entity = new StringEntity(object.toString(), "utf-8");

        //将格式化好的JSON对象（也就是body体），放在post请求中
        httpPost.setEntity(entity);


        //使用 defaultHttpClient对象 执行请求
        HttpResponse response = defaultHttpClient.execute(httpPost);

        // 打印响应信息
        String result = EntityUtils.toString(response.getEntity());
        System.out.println("响应信息---------------------");
        System.out.println(result);

    }
}
