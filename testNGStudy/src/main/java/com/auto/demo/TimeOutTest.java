package com.auto.demo;

import org.testng.annotations.Test;

public class TimeOutTest {

    // 期望在 3000 毫秒内执行完成
    @Test(timeOut = 3000)
    public void timeOutTest_Succeed() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("测试通过");
    }

    @Test(timeOut = 2000)
    public void timeOutTest_TimeOut() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("测试失败");
    }
}
