package main.java.ComBasicPrimary;

public class ClassPolymorphic {  // 多态
    /*
    ①，多态的前提：
        1、类与类之间必须存在关系：继承关系、（接口）实现关系
        2、必须有重写
   ②，多态的体现：
       1，父类引用指向子类对象  如：
       // ComBasicPrimary.Cat（子） 和 ComBasicPrimary.Animal（父）是继承关系，且Cat 重写了sing()方法
	   Void function(ComBasicPrimary.Animal a){ a.sing }
       引用时 function(ComBasicPrimary.Cat)：指向的是 ComBasicPrimary.Cat.sing
    **/

    public static void main(String[] arge){
        Cat_3 c = new Cat_3();
        Animal_3 a = new Animal_3();
        Dog_3 d = new Dog_3();
        function(c);
        function(a);
    }

    public static void function(Animal_3 c){
        // 当传入function(ComBasicPrimary.Cat_3)时相当于： ComBasicPrimary.Animal_3 c = new ComBasicPrimary.Cat_3()，向上转型
        // 但是在这里有 多态 的特性，优先使用 ComBasicPrimary.Cat_3 里的sing
        c.sing();

    }
}

class Animal_3{
    void sing(){
        System.out.println("唱歌");
    }
}
class Cat_3 extends Animal_3{
    void sing(){
        System.out.println("喵喵喵的唱歌");
    }
}
class Dog_3 extends Animal_3{
    void sing(){
        System.out.println("汪汪汪的唱歌");
    }
}