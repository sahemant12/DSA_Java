package com.Hemantsah._5.Recursion;

public class _4_NoOfZeroes {
    public static void main(String[] args) {
        int num=32004;
//        int count=0;
//        System.out.println(NoOfZeroes(num,count));
        System.out.println(helper(num));
    }

    private static int helper(int num) {
        return NoOfZeroes(num,0);
    }

    private static int NoOfZeroes(int num, int count) {
        if(num<=0){
            return count;
        }
        if(num%10==0){
            return NoOfZeroes(num/10,count+1);
        }
            return  NoOfZeroes(num/10,count);
    }
}
