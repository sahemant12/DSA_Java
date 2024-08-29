package com.Hemantsah._5.Recursion;

public class _20_DecimalToBinary {
    public static void main(String[] args) {
        int ans=0;
//        System.out.println(decimalToBinary(17,ans));
        System.out.println(BinaryToDecimal(7,0));

    }
    public static int decimalToBinary(int num, int ans){
        if(num==1){
            return 1;
        }
        ans = decimalToBinary(num/2, ans);
        int rem = num%2;
        ans = ans*10 + rem;
        return ans;
    }
    public static int BinaryToDecimal(int num, int power){
//        int power = 0;
//        int ans = 0;
//
//        while(num>0){
//            int lastBit = num & 1;
//            ans = (int)(ans + Math.pow(2,power)*lastBit);
//            power++;
//            num = num>>1;
//        }
//        return ans;

        //using Recursion
        if(num==0){
            return 0;
        }
        return (int)((num & 1) * Math.pow(2,power) + BinaryToDecimal(num>>1, power+1));
    }
}
