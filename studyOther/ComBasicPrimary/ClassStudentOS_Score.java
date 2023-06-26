package main.java.ComBasicPrimary;

import sun.applet.Main;

public class ClassStudentOS_Score {
    // 定义成员变量
    private int on;
    private String name;
    private String sex;
    private int java;
    private int c;
    private int sql;
    private int total;
    private int average;

    // 成员方法
    public void setOn(int on){
        this.on = on;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setJava(int java){
        this.java = java;
    }
    public void setC(int c){
        this.c = c;
    }
    public void setSql(int sql){
        this.sql = sql;
    }
    public void setTotal(){
        this.total = this.c+this.java+this.sql;
    }
    public void setAverage(){
        this.average = this.total/3;
    }
    public int getOn(){
        return this.on;
    }
    public String getName(){
        return this.name;
    }
    public String getSex(){
        return this.sex;
    }
    public int getJava(){
        return this.java;
    }
    public int getC(){
        return this.c;
    }
    public int getSql(){
        return this.sql;
    }
    public int getTotal(){
        return this.total;
    }
    public int getAverage(){
        return this.average;
    }
    public String toString(){
        // 重写 toString()方法，可以直接打印 类
        // 如System.out.pringln(stu) // 不重写默认返回内存编号
        return "\t"+getOn()+"\t"+getName()+"\t"+getSex()+"\t"
                +getJava()+"\t"+getC()+"\t"+getSql()+"\t"
                +getTotal()+"\t"+getAverage();
    }

}
