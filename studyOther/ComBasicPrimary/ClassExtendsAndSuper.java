package main.java.ComBasicPrimary;

public class ClassExtendsAndSuper{  // difficulty难点  继承
    /** 继承的定义，使用，与在子类、父类的成员变量
     ①，1、继承extends的使用：不要为了简化代码而使用继承，
            要在子类中有父类共同的属性时使用继承（如，猫科（父类），猫（子类））。
        2、继承不了 parvate 修饰的方法
        3、Class 类名A extends 类名B（）{ } ：继承可以直接使用成员变量
     ②，1、C被B继承， B被A继承，A拥有整个继承体系的成员。
        2、Java 中不支持多继承。 A extends B,C（）{ }。
     ③，1、当 类B 被 类A 继承中存在相同变量 name：
        2、在类A中调用name默认调用 A中的name。
        3、如果需要调用类B的name：super.name （表示父类name）。
        4、This.name：默认选择子类name，如果子类没有，则调用父类的name。
     ④，1、相同的函数（方法）（重写父类）：
        2、使用时，默认选择子类。
        3、重写父类时：
             子类访问权限(public 最大)需要比父类访问权限相等或者更大
        4、继承父类的成员变量，需要在子类方法中使用赋值，
            否则默认为子类新定义成员变量
     ⑤，1、父类的构造方法不能被子类重写
        2、子类构造方法第一行默认是 super()：父类构造方法
        3、当父类唯一的构造方法有参数是，子类构造方法第一行要加super(参数)
     *
     */
    public static void main(String[] arge){
        Cat c = new Cat();
        System.out.println(c.toString());
        c.print();

        // 构造方法
        Zi z = new Zi();  // 默认调用的 super() ：父类构造方法
        Zi z1 = new Zi("子类");

    }


}

class  Test1{
    private void print(){  // 无法继承
        System.out.println("ComBasicPrimary.test");
    }
}
class Animal{   // 父类 // 动物
    String biology = "动物";   // 生物
}

class Felid extends Animal{  // 猫科动物
    String species = "猫科动物";   // 物种
    void print(){
        System.out.println("物种是猫科动物");
    }

}
class Cat extends Felid{  // 子类
    String biology = "陆地动物";
    String name = "猫";
    void print(){
        species = "重新定义Felid的成员变量";  // 重新定义Felid的成员变量
        System.out.println("陆地动物的猫"+species);  // 默认使用子类的方法
    }
    public String toString(){
        return biology +"："+ species+"：" + name   // 这里的biology 是子类的
                +"：" +super.biology ;   // 这里的 biology是父类的
    }
}

class Fu{
    String name;
    Fu(){
        System.out.println("父类构造方法");
    }
    Fu(String name){
        System.out.println("父类有参构造方法");
    }
}

class Zi extends Fu{
//    ComBasicPrimary.Fu(){
////       // 父类构造方法不能被子类重写
////    }
    Zi(){
        super();
        System.out.println("子类构造方法");
    }
    Zi(String n){
        super(n);
        System.out.println("子类有参构造方法");
        this.name = n;
    }
}

