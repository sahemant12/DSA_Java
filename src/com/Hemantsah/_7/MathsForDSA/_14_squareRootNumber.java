package com.Hemantsah._7.MathsForDSA;

public class _14_squareRootNumber {
    public static void main(String[] args) {
        int num=3;
        int deciPos=3;
        System.out.printf("%.3f",Math.sqrt(num));
        System.out.println();
        System.out.printf("%.3f",sqRoot(deciPos,num));
    }

    public static float sqRoot(int deciPos, int num) {
        int s=0;
        int e=num;
        while(s<=e){
            int mid=(s+(e-s)/2);
            if(mid*mid==num){
                return mid;
            }else if(mid*mid>num){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        float root=e;
        float incr=0.1f;
        for (int i = 0; i < deciPos; i++) {
            while (root * root < num) {
                    root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
