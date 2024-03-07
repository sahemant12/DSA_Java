package com.Hemantsah._7.MathsForDSA;

public class _10_FirstSetBitPos {
    public static void main(String[] args) {
        int num=32;
        System.out.println(getFirstSetBitPos(num));
    }

    public static int getFirstSetBitPos(int num) {
         int setBitPos = num & (-num); //length of setBitPos is equal to first SetBitPos
        int firstBitPos = (int)((Math.log(setBitPos))/(Math.log(2))) + 1;
        return firstBitPos;
    }
}
