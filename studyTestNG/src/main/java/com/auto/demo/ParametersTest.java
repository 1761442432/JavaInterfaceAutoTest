package com.auto.demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    /**
     * xml文件写法。注意：parameter   p是小写
     * <suite name="demo">
     *     <test name="paramter">
     *         <parameter name="name" value="zhangshan"/>
     *         <parameter name="age" value="18"/>
     *         <classes>
     *             <class name="com.auto.demo.ParametersTest"/>
     *         </classes>
     *     </test>
     * </suite>
     */
    @Test
    @Parameters({"name", "age"})            // 在xml文件中，向@Test传入参数
    public void paramterTest(String name, int age){
        System.out.println("name="+name+"   age="+age);
    }
}
