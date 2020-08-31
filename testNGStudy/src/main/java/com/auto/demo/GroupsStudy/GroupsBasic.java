package com.auto.demo.GroupsStudy;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsBasic {

    /**
     * server : BeforeGroups执行了
     * server : test_01执行了
     * client : BeforeGroups执行了
     * client : test_02执行了
     * server : test_03执行了
     * server : AfterGroups执行了
     * client : test_04执行了
     * client : AfterGroups执行了
     */

    @Test(groups = "server")
    public void test_01(){
        System.out.println("server : test_01执行了");
    }

    @Test(groups = "client")
    public void test_02(){
        System.out.println("client : test_02执行了");
    }

    @Test(groups = "server")
    public void test_03(){
        System.out.println("server : test_03执行了");
    }

    @Test(groups = "client")
    public void test_04(){
        System.out.println("client : test_04执行了");
    }

    @BeforeGroups("server")
    public void beforeGroups_server(){
        System.out.println("server : BeforeGroups执行了");
    }

    @AfterGroups("server")
    public void afterGroups_server(){
        System.out.println("server : AfterGroups执行了");
    }

    @BeforeGroups("client")
    public void beforeGroups_client(){
        System.out.println("client : BeforeGroups执行了");
    }

    @AfterGroups("client")
    public void afterGroups_client(){
        System.out.println("client : AfterGroups执行了");
    }
}
