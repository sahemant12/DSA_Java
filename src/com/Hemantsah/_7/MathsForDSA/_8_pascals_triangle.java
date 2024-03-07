package com.Hemantsah._7.MathsForDSA;

public class _8_pascals_triangle {
    public static void main(String[] args) {
        int num=5;
        pascalsTriangle(num);
        sumOfNthRow_PascalTriangle(num);
    }

    public static void sumOfNthRow_PascalTriangle(int num) {
        int shiftNum =1;
        for (int i = 1; i <num ; i++) {
             shiftNum = shiftNum<<1;
        }
        System.out.println(shiftNum);
    }

    public static void pascalsTriangle(int num) { //Formula: n!/(n-r)! r!
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=i; j++) {
            int value = (factorial(i-1))/(factorial((i-1)-(j-1))*factorial(j-1));
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
    public static int factorial(int num){
        int facto =1;
        for (int i = 1; i <num ; i++) {
            facto*=i+1;
        }
        return facto;
    }
}
