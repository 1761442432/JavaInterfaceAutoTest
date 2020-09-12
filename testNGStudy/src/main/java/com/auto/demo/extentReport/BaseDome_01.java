package com.auto.demo.extentReport;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseDome_01 {

    @Test
    public void test_01(){
        // 基本断言， 实际值：1 与 期望值：2 比较，该测试失败
        Assert.assertEquals(1, 2);
    }
    @Test
    public void test_02(){
        // 1 与 1 比较，测试成功
        Assert.assertEquals(1, 1);
    }
    @Test
    public void reporterTest(){
        Reporter.log("这是我自己创建的日志。");
        throw new RuntimeException("这是我自己创建的运行异常。");
    }
}
