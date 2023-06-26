package main.java.ComBasicMiddle_rank;

import java.util.ArrayList;
import java.util.Scanner;

// 主函数
public class GatherStudentOS {
    public static void main(String[] arge){
        ArrayList arr = new ArrayList();
        Spadmin spadmin = new Spadmin(arr);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入您需要使用的功能：");
            System.out.println("1，添加一件食品");
            System.out.println("2，删除一件食品");
//            System.out.println("3，修改一件食品的价格");
            System.out.println("4，显示所有食品的信息");
            try{
                int num = sc.nextInt();
                if(num == 1) {
                    System.out.println("请输入食品的name");
                    String name = sc.next();
                    System.out.println("请输入食品的yanse");
                    String yanse = sc.next();
                    System.out.println("请输入食品的jiage");
                    int jiage = sc.nextInt();
                    spadmin.addsp(name, yanse, jiage);
                } else if(num == 2){
                    System.out.println("请输入食品的索引");
                    int no = sc.nextInt();
                    spadmin.resp(no);
                } else if (num == 4){
                    spadmin.xianshi();
                }
            }catch (Exception e){
                System.out.println("输入有误");
                break;
            }
        }
    }
}

// 食品管理方法
class Spadmin{
    private ArrayList arr;
    private Shipin sp;
    Spadmin(ArrayList arr){
        this.arr = arr;
    }

    void addsp(String name, String yanse, int jiage ){
        sp = new Shipin( name, yanse, jiage);
        arr.add(sp);
        System.out.println("添加成功");
    }

    void resp(int no){
        if (no < arr.size()){
            arr.remove(no);
            System.out.println("删除成功");
        } else{
            System.out.println("删除的编号不存在");
        }

    }
//    void upsp(int no, int jiage){  // 不完整
//        sp = (Shipin) arr.get(0);
//        sp.setJiage(jiage);
//
//    }
    void xianshi(){
        for(int i=0; i<arr.size(); i++){
            sp =(Shipin) arr.get(i);
            System.out.println(sp.getName()+sp.getYanse()+sp.getJiage());
        }
    }
}


// 食品类
class Shipin{
    private String yanse;
    private String name;
    private int jiage;
    Shipin(){ };
    Shipin(String name, String yanse, int jiage){
        this.name = name;
        this.yanse = yanse;
        this.jiage = jiage;
    }
    void setName(String name){
        this.name = name;
    }
    void setYanse(String yanse){
        this.yanse = yanse;
    }
    void setJiage(int jiage){
        this.jiage = jiage;
    }
    String getName(){
        return this.name;
    }
    String getYanse(){
        return this.yanse;
    }
    int getJiage(){
        return jiage;
    }
}
