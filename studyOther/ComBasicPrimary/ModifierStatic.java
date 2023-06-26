package main.java.ComBasicPrimary;

public class ModifierStatic {  // 修饰符  静态
    /*  state ： 1，存在于共享区内（只存在一份空间），同一个类，可以被new出的多个对象访问
                2，类可以直接被调用 类名.state 也可以被对象调用
             特点：
                1，随着类被加载而被调用
                2，优先级高
             static方法,1，只能访问静态成员变量
                        2，非静态方法可以访问静态成员变量
                        3，静态方法中不能定义：this super关键字。（静态方法优先存在内存，此时他们不存在内存中）

     */
    public static void main(String[] arge){
        globe g = new globe();  // new 的对象储存在 栈区。
        g.country = "中国";
        g.name = "测试";
        globe g2 = new globe();
        System.out.println(g2.country);  // g2 访问static共享区(g)的内容。结果是：中国
        System.out.println(g2.name);  // g2 访问堆区的内容，结果：null
        System.out.println(globe.country);  // 也可以被类名直接调用
//        System.out.println(ComBasicPrimary.globe.name);  // name 没有被state修饰，无法直接调用
//        print();   // 报错静态方法不能调用非静态方法

        staticTest st = new staticTest();
        // 在创建对象的时候，静态代码块（优先） 和 代码块（第二）就执行了
        st.print();

    }

    public void print(){
        System.out.println("你好");
    }
}

class globe{  // 地球
    String name;  // 成员变量随着对象的建立存在于 堆区
    int age;
    static String country;  // 静态变量存储在共享区(data) // 国家
    static void print(){
        String test = "";
//        System.out.println(name);   静态方法优先存在于成员变量，所以不可调用
        System.out.println(country);  // 静态方法可以调用静态成员变量
        System.out.println(test);    // 静态方法可以访问局部变量
    }
    void p(){
        System.out.println(country);  // 非静态方法可以访问 静态成员变量（因为他早就存在了）
    }

}

class staticTest{
    {
        System.out.println("我是代码块");
    }
    static {
        System.out.println("我是静态代码块");
    }
    void print(){
        System.out.println("我是print方法");
    }


}

