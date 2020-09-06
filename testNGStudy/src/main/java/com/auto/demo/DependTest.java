package com.auto.demo;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test_01(){
        System.out.println("test_01 run");
//        throw new RuntimeException();
    }

    // 因为 test_02 依赖 test_01，所以当 test_01 发生异常时，test_02 则不会执行
    @Test(dependsOnMethods = {"test_01"})
    public void test_02(){
        System.out.println("test_03 run");
        throw new RuntimeException();
    }

    // 因为 test_03 依赖 test_01、test_02，所以当他们其中一个发生异常时，test_03 就不会执行
    @Test(dependsOnMethods = {"test_01", "test_02"})
    public void test_03(){
        System.out.println("test_02 run");
    }
}
