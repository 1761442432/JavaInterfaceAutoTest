package main.java.ComBasicPrimary;

public class ClassExtends2_Instanceof {
    /*  总结：
    1、父类 对象名A = new 子类() ：称为 向上转型
               向上转型：可以使用父类的成员变量，不能使用子类的成员变量
    2、子类 对象名B = (子类) 对象名A ：称为 向下转型
             向下转型可以使用子类和父类的所有成员变量
    **/
    public static void main(String[] args){
        Animal_2 c = new Cat_2();   // 向上转型
        c.sleep();   // 可以调用 ComBasicPrimary.Animal_2 的成员
//        c.mousing();   // 向下转型后不能 ComBasicPrimary.Cat_2 的成员

        Cat_2 cat = (Cat_2) c;   // 向下转型 需要强制转型 (ComBasicPrimary.Cat_2 )
        cat.sleep();
        cat.mousing();  // 向下转型后可以使用 ComBasicPrimary.Cat_2 的所有成员

//        ComBasicPrimary.Dog_2 dog = (ComBasicPrimary.Dog_2) c;   // ComBasicPrimary.Cat_2 类型不能转换为 Dog_2类型

        System.out.println(cat instanceof Animal_2);
        // 判断 左边的对象是否是右边 类 的实例（对象）

    }
}


class Animal_2{
    void sleep(){
        System.out.println("睡觉中");
    }
}

class Cat_2 extends Animal_2{
    void mousing(){
        System.out.println("猫会捕鼠");
    }
}

class Dog_2 extends Animal_2{
    void eat(){
        System.out.println("吃");
    }
}
