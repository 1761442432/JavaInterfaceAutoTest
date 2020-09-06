package com.auto.demo;

import org.testng.annotations.Test;

public class MultThreadOnXmlTest {

    @Test()
    public void multThreadOnXmlTest(){
        System.out.printf("线程id：%s%n", Thread.currentThread().getId());
    }

    @Test()
    public void multThreadOnXmlTest_02(){
        System.out.printf("线程id：%s%n", Thread.currentThread().getId());
    }

    @Test()
    public void multThreadOnXmlTest_03(){
        System.out.printf("线程id：%s%n", Thread.currentThread().getId());
    }
}
