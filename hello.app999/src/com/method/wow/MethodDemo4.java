package com.method.wow;

public class MethodDemo4 {
    public static void main(String[] args) {
        int arr[] ={1,2,3};
        change(arr);
        System.out.println(arr[1]);
    }
    public  static  void change(int []arr){
        System.out.println("fangfaneibu2："+arr[1]);
        arr[1]=99;
        System.out.println(arr[1]);
    }
}
