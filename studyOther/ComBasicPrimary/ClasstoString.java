package main.java.ComBasicPrimary;

class people{
    String name;
    int age;
    public String toString(){   // 重写 toString() 方法
        return ("姓名："+name+"  年龄："+age);
    }

}
public class ClasstoString {
    public static void main(String[] arge){
        String name = new String("小明");  // 相等于 String name = "小明"
        System.out.println(name.toString());   // 相等于 pringln(name)

        people p = new people();
        p.name = "小红";
        p.age = 18;
        // 不重写 String() 方法默认打印哈希码值
        System.out.println(p.toString());    // 相等于 println(p)
    }
}
