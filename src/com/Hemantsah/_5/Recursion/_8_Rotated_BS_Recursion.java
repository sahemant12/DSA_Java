package com.Hemantsah._5.Recursion;
// kunal kushwaha done it in more simpler way: https://www.youtube.com/watch?v=sTdiMLom00U&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=28
public class _8_Rotated_BS_Recursion {
    public static void main(String[] args) {
        int[] arr = {10, 12,15,15,16, 2, 4, 5, 7, 8, 9};
        int target = 0;
        System.out.println(RBS_recursion(arr, target));
    }

    private static int RBS_recursion(int[] nums, int target) {
        int pivot = findPivot(nums, 0, nums.length - 1);
//        System.out.println("pivot"+" "+pivot);
        //If pivot not found then just do normal binary search
        if (pivot == -1) {
            return BinarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return BinarySearch(nums, target, 0, pivot - 1);
        } else {
//            System.out.println("ohh yes");
            return BinarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    private static int BinarySearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return BinarySearch(arr, target, s, mid - 1);
        } else {
            return BinarySearch(arr, target, mid + 1, e);
        }
    }

    private static int findPivot(int[] arr, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (e > mid && arr[mid] > arr[mid + 1]) {
            return mid;
        } else if (mid > s && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        } else if (arr[s] > arr[mid]) {
            return findPivot(arr, 0, mid - 1);
        } else {
            return findPivot(arr, mid + 1, arr.length - 1);
        }
    }
}
