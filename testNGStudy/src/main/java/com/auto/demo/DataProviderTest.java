package com.auto.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @DataProvider(name = "data")    // name = 与上面对应
    public Object[][] getDataProviderTestParams(){
        Object[][] object = new Object[][]{
                //测试方法共执行2次。里面有几组参数，@Test就会执行几次。
                {"zhangsan", 18},
                {"lisi", 19}
        };
        return object;
    }
    // 声明 dataProvider = "data"， 可以向 String name, int age 传入参数
    @Test(dataProvider = "data")
    public void dataProviderTest(String name, int age){

        System.out.println("@DataProvider 返回几组参数，本测试方法就会执行几次");
        System.out.println("name="+name+"   age="+age);
    }

    @DataProvider(name = "data_02")
    public Object[][] getParams(Method method){    // 固定写法，Method来自java.lang.reflect.Method
        Object[][] object = null;
        // 判断方法名是不是：dataProviderTest_02
        // 是，则向 dataProvider = "data_02" 的 dataProviderTest_02 方法传入参数
        if (method.getName().equals("dataProviderTest_02")){
            object = new Object[][]{
                    {"zhangsan_02", 29}
            };
        }else if (method.getName().equals("dataProviderTest_03")){  // 判断方法名是不是：dataProviderTest_03
            object = new Object[][]{
                    {"lisi_03", 30},
                    {"liqiang_03", 32}
            };
        }
        return object;
    }
    // 声明 dataProvider = "data_02"， 可以向 String name, int age 传入参数
    @Test(dataProvider = "data_02")
    public void dataProviderTest_02(String name, int age){
        System.out.println("data_02： name="+name+"   age="+age);
    }
    @Test(dataProvider = "data_02")
    public void dataProviderTest_03(String name, int age){
        System.out.println("data_02： name="+name+"   age="+age);
    }

}
