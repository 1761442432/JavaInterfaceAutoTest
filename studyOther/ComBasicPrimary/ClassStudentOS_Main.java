package main.java.ComBasicPrimary;

import java.util.Scanner;

public class ClassStudentOS_Main {
    public static void main(String[] arge){
        System.out.print("请定义学生的人数：");
        Scanner in = new Scanner(System.in);
        int people = in.nextInt();
        ClassStudentOS_Score[] stu = new ClassStudentOS_Score[people];
        ClassStudentOS_Admin admin = new ClassStudentOS_Admin();
        if (people >= 100){  // 控制人数
            System.out.println("人数最多不超过100");
        }else{
            while (true){
                System.out.println("请输入你要使用的功能：");
                System.out.println("11：添加一个学生");
                System.out.println("12：查找一个学生");
                System.out.println("13：根据编号更新学生的信息");
                System.out.println("14：根据编号删除学生");
                System.out.println("15：根据编号输入学生的各门成绩");
                System.out.println("16：根据某门成绩进行排序");
                System.out.println("17：根据总分进行排序");
                System.out.println("99：退出系统");
                int function = in.nextInt();
                if (function == 99){
                    System.out.println("本系统退出。");
                    break;
                } else if (function == 11) {
                    if (stu[stu.length-1] == null){ // 只有最后 stu 的最后一位为空，才执行下列
                        System.out.println("请输入学生的姓名：");
                        String name = in.next();
                        System.out.println("请输入学生的性别：");
                        String sex = in.next();
                        admin.createStu(name, sex, stu);
                        admin.print(stu);
                    }else{
                        System.out.println("当前到达最大学生人数，无法继续添加。");
                    }
                } else if(function == 12){
                    System.out.println("请输入需要查找的学生编号：");
                    int on = in.nextInt();
                    int i = admin.findStu(on, stu);  // 保存findStu()的返回结果
                    if(i == 9999){
                        System.out.println("编号不存在");
                    }else{
                        admin.print(stu, i);
                    }
                }else if(function == 13){
                    System.out.println("请输入需要更新的学生编号：");
                    int on = in.nextInt();
                    int i = admin.findStu(on, stu);
                    if (i == 9999){
                        System.out.println("编号不存在");
                    }else {
                        System.out.println("请输入学生新的姓名：");
                        String name = in.next();
                        System.out.println("请输入学生新的性别：");
                        String sex = in.next();
                        admin.updateStu(on, name, sex, stu);
                        admin.print(stu, on);
                    }
                }else if(function == 14){
                    System.out.println("请输入需要删除的学生编号：");
                    int on = in.nextInt();
                    int i = admin.findStu(on, stu);
                    if (i == 9999){
                        System.out.println("编号不存在");
                    }else {
                        admin.delete(on, stu);
                        System.out.println("学生编号("+on+")删除成功");
                        admin.print(stu);
                    }
                } else if(function == 15){
                    System.out.println("请输入需要输入成绩的学生编号：");
                    int on = in.nextInt();
                    int i = admin.findStu(on, stu);
                    if (i == 9999){
                        System.out.println("编号不存在");
                    }else {
                        System.out.println("请输入"+stu[on-1].getName()+"的java成绩：");
                        int java = in.nextInt();
                        System.out.println("请输入"+stu[on-1].getName()+"的c成绩：");
                        int c = in.nextInt();
                        System.out.println("请输入"+stu[on-1].getName()+"的sql成绩：");
                        int sql = in.nextInt();
                        admin.inputScore(on, java, c, sql, stu);
                        System.out.println("输入成绩成功。");
                        admin.print(stu, on);
                    }
                } else if(function == 16){
                    System.out.println("请输入需要排序的成绩：");
                    String score = in.next();
                    admin.sortScore(score, stu);
                    admin.print(stu);
                } else if(function == 17){
                    admin.sortScore("total", stu);
                    admin.print(stu);
                } else{
                    System.out.println("输入错误，请重新输入。");
                }
            }

        }

    }

}
