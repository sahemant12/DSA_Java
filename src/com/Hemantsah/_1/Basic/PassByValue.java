package com.Hemantsah._1.Basic;

public class PassByValue {
    public static void main(String[] args) {
        int a=10, b=20;
        String fname="Hemant", lname="sah";

        swapInt(a,b);
        System.out.println(a+" "+b);

        swapString(fname,lname);
        System.out.println(fname+" "+lname);
    }

    public static void swapString(String fname, String lname) {
        String temp = fname;
        fname=lname;
        lname=temp;
        //This change will only valid in this scope only

    }

    public static void swapInt(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        //This change will only valid in this scope only
    }


}
