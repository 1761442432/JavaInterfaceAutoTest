package main.java.ComBasicMiddle_rank;

import java.util.ArrayList;

public class GatherArrayList {
    public static void main(String[] arge){
        ArrayList arr = new ArrayList();  // 创建一个集合类对象：arr
        Students stu = new Students("大乔", 18, 90);
        Students stu2 = new Students("刘备", 20, 89);
        Students stu3 = new Students("周瑜", 21, 67);
        arr.add(stu);   // 在 集合类对象arr 中添加 stu
        arr.add(stu2);
        arr.add(stu3);
        arr.add(2,stu);   // 在索引 2 的位置添加
        arr.remove(2);   // 删除 索引 2 位置的信息
        System.out.println("大小为："+arr.size());   // arr.size()  ：查看大小 类似于数组的长度.length()
        System.out.println(arr.get(0)); // 获取集合类的 0 索引下的信息
        // 集合类的遍历
        for (int i =0; i<arr.size(); i++){
            Students st = (Students) arr.get(i);  // 将 i 索引的信息强制转换为 Studnets 类型
            System.out.println("第"+i+"个学生姓名是："+st.getName()); // getName() 获取学生姓名
        }
    }

}

class Students{
    private String name;
    private int age;
    private int score;
    Students(String name, int age, int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    int getScore(){
        return this.score;
    }

}
