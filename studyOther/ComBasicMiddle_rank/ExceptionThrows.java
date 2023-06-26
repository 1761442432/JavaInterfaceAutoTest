package main.java.ComBasicMiddle_rank;

import java.util.*;

public class ExceptionThrows {
    public static void main(String[] a) throws Exception{  // 将异常抛给上级处理：java虚拟机
        Th_test t = new Th_test();
//        try {
//            t.th();
//        } catch (Exception e){
//            System.out.println("您输入有误");
//        }
        t.th();
        System.out.println("程序正常关闭");
    }
}
class Th_test {
    void th() throws Exception{  // 将异常抛给上级处理： 调用这个方法的地方
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a / b;
        System.out.println("结果为：" + c);
    }

}
