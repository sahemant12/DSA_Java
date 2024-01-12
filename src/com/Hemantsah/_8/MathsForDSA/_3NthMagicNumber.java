package com.Hemantsah._8.MathsForDSA;

public class _3NthMagicNumber {
    public static void main(String[] args) {
        int num=3;
        System.out.println(magicNum(num));
    }

    public static int magicNum(int num) {
        int magicno=0;
        int base=5;
        while(num>0){
            int lastBinaryDigit = num&1;
            magicno+= lastBinaryDigit*base;
            base=base*5;
            num=num>>1;
        }
        return magicno;
    }
}
