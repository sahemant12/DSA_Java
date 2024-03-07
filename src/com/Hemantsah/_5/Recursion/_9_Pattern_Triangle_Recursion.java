package com.Hemantsah._5.Recursion;

public class _9_Pattern_Triangle_Recursion {
    public static void main(String[] args) {
//    pattern_triangle1(5,1);
    pattern_triangle2(5,1);

    }

    private static void pattern_triangle2(int i, int j) {
        if(i==0){
            return;
        }
        if(i>=j){
            pattern_triangle2(i,j+1);
            System.out.print("*");

        }else{
            pattern_triangle2(i-1,1);
            System.out.println();

        }
    }

    private static void pattern_triangle1(int i, int j) {
        if(i==0){
            return;
        }
        if(i>=j){
            System.out.print("*");
            pattern_triangle1(i,j+1);
        }else{
            System.out.println();
            pattern_triangle1(i-1,1);
        }
    }
}
