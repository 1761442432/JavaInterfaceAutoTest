package main.java.ComBasicPrimary;

class object{
    String namre;
    int age;
    public void ObjectEasy(){  // 创建一个无返回参数(void)的方法
        System.out.println("I'm one ComBasicPrimary.object!");
    }
    public int Objectadd(int a, int b){ // 创建有返回参数(int )的方法
        return a+b;
    }
}
public class ClassAndObject {
    public static void main(String[] arge){
        object ob = new object(); // 创建对象
        ob.age = 10;  // age 赋值
        ob.ObjectEasy();  // 调用方法
        System.out.println(ob.age);

        int sum = ob.Objectadd(10,29);
        System.out.println(sum);
    }
}
