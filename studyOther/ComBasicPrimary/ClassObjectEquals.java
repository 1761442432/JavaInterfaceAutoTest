package main.java.ComBasicPrimary;

public class ClassObjectEquals {
    /*
    每个（类）对象都默认 extends Object
    并且可以使用Object类的成员如：toString()， equals()
    String str 也是对象
    对象A == 对象B ： 比较的是内存地址
    **/
    public static void main(String[] arge){
        System.out.println(new Ob_test().toString());

        System.out.println(new Ob_equals().equals(new Ob_test()));

    }
}

class Ob_test{  // 相当于： class ComBasicPrimary.Ob_test extends Object{  }

}
class Ob_equals{
    String num;
    public boolean equals(Object obj){  //重写 equals方法
        if (obj instanceof Ob_equals){  // 判断对象是否为 ComBasicPrimary.Ob_equals
            Ob_equals obj2 = (Ob_equals) obj; // 强制向下转型
            return this.num == obj2.num;  // 比较内存地址
        } else{
            return false;
        }
    }
}
