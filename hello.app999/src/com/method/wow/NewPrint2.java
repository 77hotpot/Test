package com.method.wow;

public class NewPrint2 {
    public static void main(String[] args) {
        int []arr={0,1,2,3,4,5,6};
        int []arr1={0,1,2,3,4,5};
        boolean index=searchIndex(arr,arr1);
        System.out.println(index);
    }
    public static boolean searchIndex(int []arr,int []arr1){
        if (arr.length==arr1.length)
        {
            for(int i=0;i<arr.length;i++){
               if (arr[i]!=arr1[i]){
                   return false;
            }
        }
        }
        else return false;
        return true;
    }
}
