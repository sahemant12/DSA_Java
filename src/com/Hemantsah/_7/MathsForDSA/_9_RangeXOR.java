package com.Hemantsah._7.MathsForDSA;

public class _9_RangeXOR {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(XOR(num));
        //between a and b
        int a=3;
        int b=9;
        System.out.println(XorBetween_a_b(a,b));
    }

    public static int XorBetween_a_b(int a, int b) {
        return XOR(a-1)^XOR(b);
    }

    public static int XOR(int num) {
        int xor = num % 4;
        if (xor == 0) {
            return num;
        } else if (xor == 1) {
            return 1;
        } else if (xor == 2) {
            return num + 1;
        }else{
            return 0;
        }
    }
}
