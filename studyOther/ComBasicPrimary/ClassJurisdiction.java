package main.java.ComBasicPrimary;

class test{
    protected static void print2(){  // protected ：在当前包下可以调用
        System.out.println("protected");
    }
}
class test_03{
    private String name;

    private void setname(String name){
        this.name = name;  // this 代表类，即代表类中的变量 name

    }
    public test_03 get_test(){
        return this;
    }
}
public class ClassJurisdiction extends test{ // 权限
    private static void print1(){  // 在当前类下可以调用
        System.out.println("private");
    }
    public static void get_name(String anme){

    }
    public static void main(String[] args){  // 在其他包也可以调用
        System.out.println("public");
        print1();
        print2();
    }

}
