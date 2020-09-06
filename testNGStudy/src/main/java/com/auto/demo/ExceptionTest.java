package com.auto.demo;

import org.testng.annotations.Test;

public class ExceptionTest {

    /**
     * 期望异常：
     * 一般用于传入一些不合规的参数，期望使程序发生异常时使用
     */

    @Test(expectedExceptions = RuntimeException.class)
    public void exceptionTest_RuntimeException(){

        System.out.println("当声明期望异常，并且发生异常时，测试通过！");
        throw new RuntimeException();
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void exceptionTest_NoException(){
        System.out.println("当声明期望异常，实际没有发生异常时，则测试不通过！");
    }

}
