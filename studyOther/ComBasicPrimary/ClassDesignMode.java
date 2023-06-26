package main.java.ComBasicPrimary;

public class ClassDesignMode {  // 模板方法设计模式  // 设计 模式
    public static void main(String[] arge){
        DeMo_test d = new DeMo_test();
        d.getTime();
    }


}

abstract class Demo{
    // 求一段代码的运行时间
    public final void getTime(){ // final 修饰后 安全更高，不被重写
        // System.currentTimeMillis 在 java.Long 包中
        // currentTimeMillis()  是静态方法，可以直接被调用
        Long start = System.currentTimeMillis(); // 获取当前时间（精确到毫秒）
        function();
        Long stop = System.currentTimeMillis();
        System.out.println("一共花费（毫秒）："+(stop-start));
    }
    abstract void function();
}
class DeMo_test extends Demo{
    void function(){
        for(int i=0; i<1000; i++){
            System.out.print("f");
        }
        System.out.println();
    }
}