package com.Hemantsah._3.Searching;

import java.util.Arrays;

public class _2dArrayLinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {2,7,10},{3,5,7},{8,11,14,6}
        };
        int target = 80;
        System.out.println(Arrays.toString(linearSearch2d(arr,target)));
    }
    public static int[] linearSearch2d(int[][] arr, int target) {
        if(arr.length==0){
            return new int[] {-1,-1};
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target==arr[i][j]){
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {-1,-1};
    }
}

