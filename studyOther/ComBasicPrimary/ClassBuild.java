package main.java.ComBasicPrimary;

public class ClassBuild {   // build 构造
    public static void main(String[] arge){
        student stu = new student("name");  // 调用了构造方法
        System.out.println("----------------------------");
        student stu2 = new student("小明",18);
    }
}

class student{
    String name;
    int age;
    public student(){
        System.out.println("我是无参数构造方法");
    }
    public student(String name){
        this.name = name;
        System.out.println("我是有参构造方法"+this.name);
    }
    public student(String name, int age){
        //        ComBasicPrimary.student(name);   // 构造方法不能直接被调用
        this(name);  // 调用了构造方法 public ComBasicPrimary.student(String name)
        this.age = age;
        System.out.println(this.name+this.age);
    }
    {
        System.out.println("初始化构造代码块");  // 创建对象的时间就会执行，用于类的初始化
    }
}
