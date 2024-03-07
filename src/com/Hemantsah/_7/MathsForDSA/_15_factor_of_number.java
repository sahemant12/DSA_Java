package com.Hemantsah._7.MathsForDSA;

import java.util.ArrayList;

public class _15_factor_of_number {
    public static void main(String[] args) {
        int num=36;
        //by brute-force approach: Time Complexity- 0(n)
        factorOfNumber(num); //0(sqrt(n))
    }

    public static void factorOfNumber(int num) {
        ArrayList<Integer>list = new ArrayList<Integer>();

        for (int i = 1; i*i <=num ; i++) {
            if(num%i==0){
                list.add(i);
                if(!(num/i==i)){
                    list.add(num/i);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
