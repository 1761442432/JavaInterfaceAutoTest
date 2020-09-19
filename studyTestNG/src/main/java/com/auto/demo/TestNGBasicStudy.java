package com.auto.demo;

import org.testng.annotations.*;

public class TestNGBasicStudy {

    @Test(description = "你好")
    public void testCase_01(){
        System.out.println("testCase_01方法");
    }

    @Test(enabled = true)
    public void testCase_02(){
        System.out.println("testCase_02方法");
    }

    @BeforeMethod
    public void beforeMethodTest(){
        System.out.println("BeforeMethod在每个@Test方法运行前都会执行一次");
    }

    @AfterMethod
    public void afterMethodTest(){
        System.out.println("AfterMethod在每个@Test方法运行后都会执行一次");
    }

    @BeforeClass
    public void beforeClassTest(){
        System.out.println("BeforeClass只执行一次，在类运行之前执行");
    }

    @AfterClass
    public void afterClassTest(){
        System.out.println("AfterClass只执行一次，在类运行之后执行");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("测试套件：在所有类运行之前执行，优先级最高");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("测试套件：在所有类运行之后执行，优先级最低");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest在每一个xml classes 运行后都会执行，优先级比BeforeClass更高");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest在每一个xml classes 运行前都会执行，优先级比AfterClass更低");
    }
}
