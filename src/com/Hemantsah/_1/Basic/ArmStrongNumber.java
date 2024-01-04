package com.Hemantsah._1.Basic;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        System.out.println(ASN(in.nextInt()));
        for(int i=100; i<10000; i++){
            if(ASN(i)){
                System.out.println(i+" ");
            }
        }
    }

    public static boolean ASN(int num) {
        int sum=0;
        int temp=num;
        while(temp>0){
            int rem=temp%10;
            sum+=rem*rem*rem;
            temp/=10;
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}
