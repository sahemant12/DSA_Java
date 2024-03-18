package com.Hemantsah._6.Backtracking;

import java.util.ArrayList;

public class _1_Counting_Printing_Path {
    public static void main(String[] args) {
//        System.out.println(countPath(3,3));
        printPath("",3,3);
//        System.out.println(printPathReturn("",3,3));
//        System.out.println(printPathDiagonalReturn("",3,3));
    }

    private static ArrayList<String> printPathDiagonalReturn(String p, int r, int c) {
        if(r==1 && c==1){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();

        if(r>1 && c>1){
            list.addAll(printPathDiagonalReturn(p+'D',r-1,c-1));
        }
        if(r>1){
            list.addAll(printPathDiagonalReturn(p+'V',r-1,c));
        }
        if(c>1){
            list.addAll(printPathDiagonalReturn(p+'H',r,c-1));
        }
        return list;
    }

    private static void printPath(String p, int r, int c) {
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            printPath(p+'D',r-1,c);
        }
        if(c>1){
            printPath(p+'R',r,c-1);
        }
    }

    private static ArrayList<String> printPathReturn(String p, int r, int c) {
        if(r==1 && c==1){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();
        if(r>1){
            list.addAll(printPathReturn(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(printPathReturn(p+'R',r,c-1));
        }
        return list;
    }

    private static int countPath(int r, int c) {
        if(r==1 || c==1){
            return 1;
        }
        return countPath(r-1,c) + countPath(r,c-1);
    }
}
