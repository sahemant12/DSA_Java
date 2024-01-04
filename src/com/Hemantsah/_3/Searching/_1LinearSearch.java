package com.Hemantsah._3.Searching;

public class _1LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,7,5,1,4,100,56,97,456};
        int target=197;
        System.out.println(linearSearch(arr,target));

        String name = "Hemant";
        char charTarget = 'h';
        System.out.println(linearCharSearch(name,charTarget));
    }

    private static boolean linearCharSearch(String name, char charTarget) {
        if(name.length()==0){
            return false;
        }
        for (int i = 0; i <name.length() ; i++) {
            if(charTarget==name.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static int linearSearch(int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
