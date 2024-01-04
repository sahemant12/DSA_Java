package com.Hemantsah._1.Basic;

public class Swap2Num {
    public static void main(String[] args) {
        int[] a={10}, b={20};
        Swap(a,b);
        System.out.println(a[0]+" "+b[0]);
    }

    public static void Swap(int[] a, int[] b) {
        int temp=a[0];
        a[0]=b[0];
        b[0]=temp;
    }
}
