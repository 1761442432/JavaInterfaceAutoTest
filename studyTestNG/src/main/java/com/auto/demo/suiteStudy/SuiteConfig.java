package com.auto.demo.suiteStudy;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite开始运行");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite结束运行");
    }

    @BeforeTest
    public void login(){
        System.out.println("BeforeTest登陆成功");
    }

    @AfterTest
    public void logout(){
        System.out.println("AfterTest退出成功");
    }
}
