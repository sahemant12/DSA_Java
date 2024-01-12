package com.Hemantsah._8.MathsForDSA;

public class _2UniqueNum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(uniqueNum(arr));
    }

    public static int uniqueNum(int[] arr) {
        int unique=0;
        for (int i:arr) {
            unique^=i;
        }
        return unique;
    }
}
