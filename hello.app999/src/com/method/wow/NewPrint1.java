package com.method.wow;

public class NewPrint1 {
    public static void main(String[] args) {
        //
        int [] arr={1,2,3,4,5};
        println(arr);
    }
    public static void println(int []arr){
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
           /* if (i==arr[arr.length-1]){
                System.out.print(arr[i]);
            }
            System.out.print(arr[i]+",");*/
            System.out.print(i==arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }
}
