package main.java.ComBasicPrimary;

import java.util.Scanner;

public class BasicArray_02 {
    // 数组的5中算法
    public static void main(String[] args){
        // 查找算法：在字符串数组中查找某个字符是否存在
        String[] arr_str = {"张三","李四","王二","狗子","鸭蛋","李四"};
        System.out.println("please input:");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        boolean tem = false;  // 作为判断的依据
        for(int i=0; i<arr_str.length; i++){
            if(name.equals(arr_str[i])){  // 判断 name 和 arr_str[i]是否相等
                tem = true;
                break;
            }
        }
        if(tem == true){  // 判断 name 和 arr_str[i]是否相等
            System.out.println("您查找的字符：“"+name+"”存在");
        }
        else{
            System.out.println("您查找的字符：“"+name+"”不存在");
        }
    }
    public void test_find(){
        // 复制数组：将数组 a 复制到数组 b
        int[] arr_a = {1,5,1,23,6};
        int[] arr_b = new int[arr_a.length];
        for (int i=0; i<arr_a.length; i++){
            arr_b[i] = arr_a[i];

        }
        for (int i=0; i<arr_a.length; i++){
            System.out.println(arr_b[i]);
        }
    }

    public void test_insert(){
        // 插入算法:从小到大排序的数组，在末尾插入数值，依然是从小到大的顺序
        int[] arr = {1,23,54,67,87};
//        System.out.print("请输入您需要插入的值：");
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
        int num = 9;
        arr[arr.length-1] = num;
        for (int i=arr.length-2; i>=0; i--){ // 从倒数第二个开始比较
            if (arr[i+1] < arr[i]){
                int tem = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = tem;
            }
            else{  // 不小于时退出，提高效率
                break;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void test_bubbling(){
        // 冒泡排序：相邻两个数排序
        int[] arr = {21,53,21,2,54,765,1,4,43,21};
        // 这里-1，因为最后一个和倒数第二个比较完就完成了。
        for(int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1; j++){
                if (arr[j]>arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    public void test_select(){
        // 选择排序：第一个和第二个--最后一个，第二个和第三个--最后...(比冒泡排序效率高)
        // 第一遍会找出最大（最小的数）
        int[] arr = {21,53,21,2,54,765,32};
        for(int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]>arr[j]){
                    int tem = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tem;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

}
