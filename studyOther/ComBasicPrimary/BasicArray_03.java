package main.java.ComBasicPrimary;

import java.util.Scanner;

public class BasicArray_03 {
    public static void main(String[] args){
        // 学生管理系统:
        // 1，提示输入多少个学生。2，提示输入多少门课程。3，提示输入学生没门课程的分数
        // 4，以表格的形式输出，并打印出总分，平均分。最后按总分排序

    }

    public void test_arrtwo(){
        // 二维数组
        int[][] arrs = {{1,243,1},{1},{21,4}}; // 第一种
        //第二种
        int[][] arrs2 = new int[3][];  // 3组
        arrs2[0] = new int[3]; // arrs2 第0组 分配3个空间
        arrs2[1] = new int[2]; // arrs2 第1组 分配2个空间
        arrs2[2] = new int[5]; // arrs2 第2组 分配5个空间
        for (int i =0; i<arrs2[0].length; i++){
            arrs2[0][i] = i+5;
        }
        for(int i=0; i<arrs2[0].length; i++){
            System.out.println(arrs2[0][i]);
        }
    }

    public void test_02(){
        // 一个二维数组，3行两列，循环输入6个人姓名，并循环输出
        String[][] arr_str2 = {{"小乔","大乔"},{"张飞","刘备"},{"白起","张良"}};
        for (int i=0; i<arr_str2.length; i++){
            System.out.println(arr_str2[i][0]+"    "+arr_str2[i][1]);
        }

//        String[][] arr_str = new String[3][];
//        arr_str[0] = new String[2];
//        arr_str[1] = new String[2];
//        arr_str[2] = new String[2];
//        int num = 0;
//        for(int i=0; i<arr_str.length; i++){
//            for(int j=0; j<arr_str[i].length;j++){
//                num ++;
//                System.out.print("请输入第"+num+"个学生的姓名：");
//                Scanner in = new Scanner(System.in);
//                arr_str[i][j] = in.next();
//            }
//        }
//        for (int i=0; i<arr_str.length; i++){
//            System.out.println(arr_str[i][0]+"    "+arr_str[i][1]);
//        }
    }
}
