package com.Hemantsah._10.Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class _14_Next_Greatest_Element {
    public static void main(String[] args) {

//        int[] arr = {3,10,4,2,1,2,6,1,7,2,9};
//        int[] arr2 = NGE(arr);
//        System.out.println(Arrays.toString(arr2));

//        int[] arr = {3,10,4,2,1,2,6,1,7,2,9};
//        int[] arr2 = NSE(arr);
//        System.out.println(Arrays.toString(arr2));

        int[] arr = {3,10,4,2,1,2,6,1,7,2,9};
        int[] arr2 = PSE(arr);
        System.out.println(Arrays.toString(arr2));

//        int[] arr = {2,13,10,12,1,11};
//        int[] arr2 = NGE_CircularLoop(arr);
//        System.out.println(Arrays.toString(arr2));
    }

    public static int[] NGE(int[] arr) {
        int[] ngeArr = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length-1; i>=0; i--) {

            //remove all elements smaller than given element
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }
            //if stack is empty, no greater element
            if (stack.isEmpty()) {
                ngeArr[i] = -1;
                stack.push(arr[i]);
            }
            //If top of stack is greater then it is next greater element
            if (!stack.isEmpty() && arr[i] < stack.peek()) {
                ngeArr[i] = stack.peek();
                stack.push(arr[i]);
            }
            }
        return ngeArr;
    }
    public static int[] NSE(int[] arr) {
        int[] nseArr = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length-1; i>=0; i--) {

            //remove all elements smaller than given element
            while (!stack.isEmpty() && arr[i] <= stack.peek()) {
                stack.pop();
            }
            //if stack is empty, no greater element
            if (stack.isEmpty()) {
                nseArr[i] = -1;
                stack.push(arr[i]);
            }
            //If top of stack is greater then it is next greater element
            if (!stack.isEmpty() && arr[i] > stack.peek()) {
                nseArr[i] = stack.peek();
                stack.push(arr[i]);
            }
        }
        return nseArr;
    }
    public static int[] PSE(int[] arr) {
        int[] pseArr = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i<arr.length; i++) {

            //remove all elements smaller than given element
            while (!stack.isEmpty() && arr[i] <= stack.peek()) {
                stack.pop();
            }
            //if stack is empty, no greater element
            if (stack.isEmpty()) {
                pseArr[i] = -1;
                stack.push(arr[i]);
            }
            //If top of stack is greater then it is next greater element
            if (!stack.isEmpty() && arr[i] > stack.peek()) {
                pseArr[i] = stack.peek();
                stack.push(arr[i]);
            }
        }
        return pseArr;
    }
    public static int[] NGE_CircularLoop(int[] arr) {
        int[] ngeArr = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2*arr.length-1; i>=0; i--) {

            //remove all elements smaller than given element
            while (!stack.isEmpty() && arr[i%arr.length] >= stack.peek()) {
                stack.pop();
            }
            //If top of stack is greater then it is next greater element
            if (!stack.isEmpty() && arr[i%arr.length] < stack.peek()) {
                ngeArr[i%arr.length] = stack.peek();
            }
            //if stack is empty, no greater element
            if (stack.isEmpty()) {
                ngeArr[i%arr.length] = -1;
            }
            stack.push(arr[i%arr.length]);
        }
        return ngeArr;
    }
}
