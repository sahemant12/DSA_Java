package com.Hemantsah._1.Basic;

public class Swap2Num {
    public static void main(String[] args) {
//        int[] a={10}, b={20};
//        Swap(a,b);
//        System.out.println(a[0]+" "+b[0]);
        String s ="abcdef";
        System.out.println(swap(s));
    }

    public static StringBuilder swap(String s){
        StringBuilder str = new StringBuilder(s);

        for(int i=0; i<s.length()/2; i++){
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(s.length()-1-i));
            str.setCharAt(s.length()-1-i, temp);
        }
        return str;
    }
    public static void Swap(int[] a, int[] b) {
        int temp=a[0];
        a[0]=b[0];
        b[0]=temp;
    }
}
