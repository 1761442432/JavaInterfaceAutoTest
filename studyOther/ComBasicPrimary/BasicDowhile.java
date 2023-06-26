package main.java.ComBasicPrimary;

import main.java.StudyTest;


public class BasicDowhile extends StudyTest {

    public static void main(String[] args){
        int i =0;
        do{
            i = 1;
            System.out.println(i);
            i++;
        }while (i<2);  // 因为先进入do{}在执行while，所以do..while至少执行一次
        String a = "11";
        System.out.println(a);

    }


}
