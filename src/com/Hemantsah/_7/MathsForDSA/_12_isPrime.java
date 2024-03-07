package com.Hemantsah._7.MathsForDSA;

public class _12_isPrime {
    public static void main(String[] args) {
        int num=91;
        for (int i = 1; i < 91; i++) { //Time complexity: 0(n*sqrt(n))
            System.out.println(i+" "+isPrime(i));
        }
    }

    public static boolean isPrime(int num) {
        if(num<=1){
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
