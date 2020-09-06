package com.auto.demo;

import org.testng.annotations.Test;

public class MultThreadTest {

    // 对该测试方法总共执行10次，一共3个并发线程（并发线程数可以设置其他的）
    @Test(invocationCount = 10, threadPoolSize = 3, enabled = true)
    public void multThreadTest(){

//        System.out.println("prinrln线程id："+Thread.currentThread().getId());
        // %s ：getId()返回的字符串， %n换行
        System.out.printf("printf线程id：%s%n",Thread.currentThread().getId());
        System.out.println("多线程测试。");
    }

}
