package com.Hemantsah._7.MathsForDSA;

public class _7_ith_Bit {
    public static void main(String[] args) {
        int num = 10000;
        int ith = 4;
        ithBit(ith,num);
    }

    public static void ithBit(int ith, int num) {
        int checkbit=1;
        for (int i = 0; i <ith-1 ; i++) {
            checkbit=checkbit<<1;
        }
        System.out.println(checkbit);
        if((num & checkbit)==0){
            System.out.println("ith bit is 0");
        }else{
            System.out.println("ith bit is 1");
        }
    }
}
