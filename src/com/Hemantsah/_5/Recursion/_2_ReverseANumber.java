package com.Hemantsah._5.Recursion;

public class _2_ReverseANumber {
    public static void main(String[] args) {
        int num=1234;
        int noOfDigits = (int)(Math.log(num)/Math.log(10)) +1;
        System.out.println(reverseANum(num,noOfDigits));
    }

    private static int reverseANum(int num, int noOfDigits) {
        if(num==0){
            return 0;
        }
        return (int) (reverseANum(num/10,noOfDigits-1) + ((num%10) * Math.pow(10,noOfDigits-1)));
    }

}
