package main.java.ComBasicPrimary;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BasicArray_01 {
    public static void main(String[] args){
        int[] arr = new int[5];
        System.out.println(arr[0]);
        int arr2[] = new int[4];
        arr2[0] = 1;
        arr2[1] = 1;
        arr2[2] = 1;
        arr2[3] = 1;
        System.out.println(arr2[1]);
        int arr3[] = new int[]{54,1,53};
        int arr4[] = {1,2,3};
        System.out.println(arr4[1]);

    }

    public void test_01(){
        // 求数组最大值
        int arr[] = {23,1,5,32};
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (max < arr[i]){
                    max = arr[i];
            }
        }
        System.out.println(max);
    }

    public void test_02(){
        // 数组排序
        int arr[] = {12,43,653,1,24};
        int num = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length-1; j++){
                if (arr[i] < arr[j]){
                    num = arr[j] ;
                    arr[j] = arr[i];
                    arr[i] = num;
            }
         }
        }
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public void test_03(){
        // 用方法排序
        int arr[] = {12,43,653,1,24};
        Arrays.sort(arr);  // 从小到大
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        // 字符串从大到小排序
        String arr2[] = {"1","a","z","q","h"};
        Arrays.sort(arr2);
        for (int i=arr2.length-1; i>=0; i--){
            System.out.println(arr2[i]);
        }
    }
}
