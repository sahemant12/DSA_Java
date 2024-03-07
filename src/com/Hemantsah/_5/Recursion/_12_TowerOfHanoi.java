package com.Hemantsah._5.Recursion;

public class _12_TowerOfHanoi {
    public static void main(String[] args) {
        int noOfDisk=3;
       TowerOfHanoi(noOfDisk,"A","B","C");
    }

    private static void TowerOfHanoi(int n,String a,String b,String c) { //No. of movement: 2^n -1
        if(n==1){
            System.out.println(a+"->"+b);
            return;
        }else{
            TowerOfHanoi(n-1,a,b,c);
            TowerOfHanoi(1,a,c,b);
            TowerOfHanoi(n-1,c,a,b);
        }
    }
}
