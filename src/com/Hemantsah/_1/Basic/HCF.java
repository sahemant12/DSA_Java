package com.Hemantsah._1.Basic;

public class HCF {
    public static void main(String[] args) {

        int largest  = num3Largest();
//        System.out.println(largest);

        int num1=10, num2=20;
        int hcf = HCF(num1, num2);
        System.out.println("HCF: "+hcf);
        System.out.println("LCM: "+LCM(num1,num2,hcf));

    }

    private static int LCM(int num1, int num2, int hcf) {
        return (num1*num2)/hcf;
    }

    private static int HCF(int num1, int num2) {
        int gcf=1;
        int small = num1<num2?num1:num2;
        for(int i=2; i<=small; i++){
            if(num1%i==0 && num2%i==0){
                gcf=i;
            }
        }
        return gcf;
    }


    private static int num3Largest() {
        int a=2, b=10, c=22;
        int max =a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
}

