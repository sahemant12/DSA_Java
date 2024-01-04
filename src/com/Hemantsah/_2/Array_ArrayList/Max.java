package com.Hemantsah._2.Array_ArrayList;

public class Max {
    public static void main(String[] args) {
        int[] arr = {2,7,5,1,4,100,56,97,456};
        System.out.println(max(arr));
    }

    public static int max(int[] arr) {
        int maxm = arr[0];
        for (int ele:arr) {
            if(ele>maxm){
                maxm=ele;
            }
        }
        return maxm;
    }
}
