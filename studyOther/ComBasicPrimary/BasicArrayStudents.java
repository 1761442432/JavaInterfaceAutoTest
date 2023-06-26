package main.java.ComBasicPrimary;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class BasicArrayStudents {
    public static void main(String[] args){
        // 学生管理系统:
        // 1，提示输入多少个学生。2，提示输入多少门课程。3，提示输入学生每门课程的分数
        // 4，以表格的形式输出，并打印出总分，平均分。最后按总分排序
        Scanner in = new Scanner(System.in);
        System.out.print("请输入学生的人数：");
        int people = in.nextInt();
        System.out.print("请输入学生课程的数量：");
        int course = in.nextInt();
        String[] arr_course = new String[course]; // 课程
        String[] arr_students = new String[people]; // 学生
        int[][] arr_score = new int[people][course+2]; // 成绩

        // 课程 name
        for (int i=0; i<arr_course.length; i++){
            System.out.print("请输入第"+(i+1)+"课程的名称：");
            arr_course[i] = in.next();
        }
        // 学生 name 分数
        for(int i=0; i<arr_students.length; i++){
            // 学生 name
            System.out.print("请输入第"+(i+1)+"个学生的姓名：");
            arr_students[i] = in.next();
            for (int j=0; j<arr_score[0].length-2; j++){ // 扣掉平均分，总分的空间
                System.out.print("请输入“"+arr_students[i]+arr_course[j]+"“的分数：");
                arr_score[i][j] = in.nextInt();
            }
        }
        // 总分  平均分
        for (int i=0; i<people; i++){
            int num = 0;
            int j=0;
            for (; j<course; j++){
                num = num +arr_score[i][j];
            }
            arr_score[i][course] = num;  // 总分在 course 后一位（因为从 0 开始）
            arr_score[i][course+1] = num/course;  // 平均分 course 后两位
        }
        // 排序
        for(int i=0; i<people-1; i++){
            for (int j=i+1; j<people; j++){
                if (arr_score[i][course]<arr_score[j][course]){
                    // 总分
                    int[] tem = arr_score[i];  // 数组 tem
                    arr_score[i] = arr_score[j];
                    arr_score[j] = tem;
                    // 学生姓名
                    String tem2 = arr_students[i];
                    arr_students[i] = arr_students[j];
                    arr_students[j] = tem2;
                }
            }
        }
        // 输出
        System.out.print("姓名");
        for (int i=0; i<arr_course.length; i++){
            System.out.print("\t\t"+arr_course[i]);
        }
        System.out.println("\t\t总分\t\t平均分\t\t排行榜");
        for(int i=0; i<arr_score.length; i++){
            System.out.print(arr_students[i]);
            for (int j=0; j<arr_score[0].length; j++){
                System.out.print("\t\t "+arr_score[i][j]);
            }
            System.out.println("\t\t第"+(i+1)+"名");
        }
    }
}
