package main.java.ComBasicPrimary;

public class BasicWhile {
    public static void main(String[] arge){
        int a = 0;
        while(1==1){
            if (a==101){  // 退出条件
                break;   // 执行这句，将退出整个循环
            }
            System.out.println(a);
            a++;
        }
    }
}
