package main.java.ComBasicPrimary;

public class ModifierInterface {
    /**
     * interface（接口） 接口名A：
     * ① class 是类， interface 是接口：里面所有都是abstract（抽象）方法
     * ② 接口中只能出现 public访问符（可以省略不写）：
     * Public static final String NAME=”小明”  // 全局常量
     * Public abstract void print();   // 抽象方法
     * ③ 接口不能被 new创建对象，使用时需要被子类 implements（实现），
     * 同时需要重写所有抽象方法
     * ④ java 中允许多实现 class A interface A, B{ }
     * ⑤ 类与类（extends），类与接口（interface），接口于接口（extends）
     * ⑥ 父类一般定义基本功能，接口一般定义扩展功能。接口的好处：可以多实现
     * */
    public static void main(String[] arge){
        Inter_imp i = new Inter_imp();
        i.print();
    }
}

interface Inter_test{   // class 定义类。 interface 定义接口
    // 接口是特使的抽象类，用于定义 抽象类中全部都是抽象方法
    public static final String NAME = "小明";  //全局变量
    public abstract void print();   // 抽象方法  show ：显示，说明
}

interface Inter_test2 extends  Inter_test{  // 接口 与 接口之间是继承关系
    void print();    // 同等于 public abstract void print();
}

class Inter_imp implements Inter_test, Inter_test2{   // java类 可以多实现(interface a, b)
    // 类 继承接口 需要 implements（实现）
    public void print(){
        System.out.println("我的名字叫小明");
    }
}
