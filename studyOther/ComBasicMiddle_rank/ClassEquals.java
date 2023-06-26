package main.java.ComBasicMiddle_rank;

public class ClassEquals {
    /**
     * A a = new A();  // equals 的比较类似于 == ，比较的是内存地址
       A a2 = new A();
       System.out.println(a2.equals(a));  // 返回 false
      String b = "nihao";
      System.out.println(b.equals("nihao"));  // 返回 ture
     */
    public static void main(String[] arge){
        A a = new A(1);  // equals 的比较类似于 == ，比较的是内存地址
        A a2 = new A(2);
        System.out.println(a2.equals(a));  // 返回 false

        B b = new B(1);
        B b2 = new B(12);
        System.out.println(b.equals(b2));
        // equals(A a1) ： 首先，这里传入 A 类是完全正常
        // 然后多态的特性是，父类引用指向子类对象。所以传入 b2时，指向的是 B 的对象 。也是正常的
        System.out.println(b.equals());   // 对象 b 的equals() 永远 ture。

    }
}

class A{
    int i;
    A(int i){
        this.i=i;
    }
    public boolean equals(A a){
        // 重写 equals()  使用 i 进行比较
        if(this.i == a.i){
            return true;
        }else{
            return false;
        }
    }
}

class B extends A{
    int j;
    B(int j){
        super(j);  // 父类需要传入一个构造方法的值
        this.j = j;
    }
    public boolean equals(A a1){
//        B a = (B) a1;
        if(this.j == a1.i){
            return true;
        }else{
            return false;
        }
    }
    public boolean equals(){
        // 这个 equals 永远相等 。因为上面的 super (j)将值给了父类的i(super.i)
        // 相当于 j 和 j 比较
        if(this.j == super.i){
            return true;
        }else{
            return false;
        }
    }
}

