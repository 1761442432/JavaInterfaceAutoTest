package main.java.ComBasicPrimary;

public class ModifierFinal {
    /**
     * final 修饰符（类、方法、变量）：
     * ① final 类：不可被继承
     * ② final 方法：不可被重写
     * ③ final 变量：不可被赋值，final 变量时要先赋值。
     *    注意：final 变量也称为 常量。书写应该为大写：NAME  MY_NAME
     * */

}
final class Fi_test{

}
class Fi_test2 {  // 无法继承 ComBasicPrimary.Fi_test。final 修饰的类 无法被继承
    final void print(){
        System.out.println("Hello word");
    }
}
class Fi_test3 extends Fi_test2{
    // final 修饰的变量称为常量。常量应该 大写：NAME , MY_NAME
    // 定义 时就要被赋值
    //  且无法再次被赋值
    final String NAME = "你好 世界";

    void print2(){  // 无法重写 print（）。 final 修饰的方法无法重写
        System.out.println(NAME);
    }
}