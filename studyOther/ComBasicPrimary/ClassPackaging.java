package main.java.ComBasicPrimary;

class affair{  // 事务
    private String name;  // 私有变量不能被另一个类调用
    private int size;
    private String colour;
    public String toString(){
        return ("name:"+name+"  size:"+size+"   colour:"+colour);
    }
    // 不声明权限修饰符，默认为 protected：同包中可被其他类调用,
    void setAffair(String name, int size, String colour){
        this.name = name; // this 代表类，即:把setAffair方法的name 赋值给affair类的name
        this.size = size;
        this.colour = colour;
    }

}
public class ClassPackaging {  // 封装
    public static void main(String[] arge){
        affair a = new affair();
        a.setAffair("小明",18,"蓝色");
        System.out.println(a);

    }
}
