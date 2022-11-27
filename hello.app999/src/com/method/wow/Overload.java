package com.method.wow;

public class Overload {
    public static void main(String[] args) {
        fire();
     //   fire("日本");
       // fire("美国",8);
    }
    public static void fire(){
        System.out.println("默认发送给火星。");
    }
    public  static  void fire(String location){
        System.out.println("默认发送导弹给"+location);
    }
    public static void fire(String location,int number){
        System.out.println("默认发送"+number+"颗导弹给"+location);
    }

}
