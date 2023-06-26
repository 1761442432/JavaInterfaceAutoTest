package main.java.ComBasicPrimary;

public class ModifierAbstract {
    /**
     * ① abstract抽象方法必须在抽象类中（方法抽象，类也必须抽象）
     * ② abstract 只能修饰类，方法。不能修饰变量
     * ③ abstract 类中可以有 非抽象方法
     * ④ extends abstract 类，需要重写所有 abstract 方法
     * ⑤ abstract 类 不能被 new创建
     * */
    public static void main(String[] arge){
//        ComBasicPrimary.Ab_animal ab = new ComBasicPrimary.Ab_animal();  // 抽象类不能被创建（实例化）
        Ab_animal abc = new Ab_cat();
        abc.sing();  // 喵喵喵的唱歌

    }
}

abstract class Ab_animal{  // 抽象方法必须在抽象类中
//    abstract int num;  // abstract 只能修饰类或方法，不能修饰变量
    abstract void sing();  // 抽象（模糊）方法sing()
    abstract void sleep();
    void print(){};  // 抽象类中可以有 非抽象方法

}
class Ab_cat extends Ab_animal{ // 继承抽象类，必须重写所有抽象方法
    void sing(){
        System.out.println("喵喵喵的唱歌");
    }
    void sleep(){}
    void cat(){

    }
}
