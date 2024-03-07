package com.Hemantsah._5.Recursion;

public class _1_SumOfDigits {
    public static void main(String[] args) {
        int num=1234;
        System.out.println(sumOfDigits(num));
    }

    private static int sumOfDigits(int num) {
        if(num==0){
            return num;
        }
        return sumOfDigits(num/10) + num%10;
    }
}
