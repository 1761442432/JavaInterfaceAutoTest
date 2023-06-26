package main.java.ComBasicPrimary;

import java.util.Scanner;

public class BasiceIf {
    public static void main(String[] arge){
        System.out.print("请输入一个数，和a(2)比较：");
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int a = 2;
        if (b > a){
            System.out.println("b>a");
        }
        else if(b<a){
            System.out.println("b<a");
        }
        else{
            System.out.println("b=a");
        }
    }

}
