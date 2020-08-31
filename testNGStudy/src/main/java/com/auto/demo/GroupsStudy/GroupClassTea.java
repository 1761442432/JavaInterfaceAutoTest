package com.auto.demo.GroupsStudy;

import org.testng.annotations.Test;

@Test(groups = "tea")
public class GroupClassTea {
    public void tea_01(){
        System.out.println("tea_01运行了");
    }

    public void tea_02(){
        System.out.println("tea_02运行了");
    }
}
