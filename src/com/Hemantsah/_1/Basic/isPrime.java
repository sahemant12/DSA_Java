package com.Hemantsah._1.Basic;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        System.out.println(isPrimeNum(in.nextInt()));
    }

    public static boolean isPrimeNum(int num) {
        if(num<=1){
            return false;
        }
        int count=2;
        while(count*count<=num){
            if(num%count==0){
                return false;
            }
            count++;
        }
        return true;
    }
}
