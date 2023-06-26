package main.java.ComBasicPrimary;

import java.util.Random;

public class ClassPolymorphic2_work {
    public static void main(String[] arge){
        Random r = new Random();
        int a = r.nextInt(3);  // 生成随机数 0，1,2
        Fk fk = new Fk();
        switch(a){  // 相当于 if else if else 的用法
            case 0:  // 当 a 为0时：
                fk = new Fk_zzx();
                break;   // 退出
            case 1:
                fk = new Fk_tzx();
                break;
            case 2:
                fk = new Fk_yzx();
                break;
        }
        fk.bx(); // 运用多态特性，运行 bx 方法
    }
}

class Fk{
    void bx(){
        System.out.println("变形");
    }
}
class Fk_zzx extends Fk{
    void bx(){
        System.out.println("Z字形方块变形");
    }

}
class Fk_tzx extends Fk{
    void bx(){
        System.out.println("T字形方块变形");
    }

}
class Fk_yzx extends Fk{
    void bx(){
        System.out.println("Y字形方块变形");
    }

}
