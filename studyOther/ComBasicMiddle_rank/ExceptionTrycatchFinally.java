package main.java.ComBasicMiddle_rank;

import java.util.*;

public class ExceptionTrycatchFinally {  // exception 异常
    public static void main(String[] arge){
        /** java异常处理机制能让程序出现异常后继续运行，而不是终止程序
         * 程序有异常能解决尽量解决 。
         * finally 一般作为异常程序的结尾
         * 可以省略，但是为了提高代码的阅读性和可靠性，做好写一下 。 */
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("结果为：" + c);
        } catch (Exception e){
            System.out.println("您输入有误");
        }
        finally{  // 无论程序是否出现异常，都会运行。一般做异常程序的结尾部分
            // 在这个 案例中， finally虽然可以省略不写，但是实际开发当中，还可能出现 try catch 有漏洞的情况
            // 所以finally 最好还是写一下，作为程序的结尾
            System.out.println("程序正常运行");
        }
        System.out.println("程序正常关闭");
    }
}
