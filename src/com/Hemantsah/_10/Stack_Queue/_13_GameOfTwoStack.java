//package com.Hemantsah._10.Stack_Queue;
//
//public class _13_GameOfTwoStack {
//    //https://www.hackerrank.com/challenges/game-of-two-stacks/problem
//}
//import java.io.*;
//        import java.math.*;
//        import java.security.*;
//        import java.text.*;
//        import java.util.*;
//        import java.util.concurrent.*;
//        import java.util.function.*;
//        import java.util.regex.*;
//        import java.util.stream.*;
//        import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class Result {
//
//    /*
//     * Complete the 'twoStacks' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts following parameters:
//     *  1. INTEGER maxSum
//     *  2. INTEGER_ARRAY a
//     *  3. INTEGER_ARRAY b
//     */
//
//    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
//        // Write your code here
//        // ArrayList to Array Conversion
//        int[] arr1 = a.stream().mapToInt(i -> i).toArray();
//        int[] arr2 = b.stream().mapToInt(i -> i).toArray();
//        return maxSelection(arr1, arr2, 0, 0, maxSum)-1;
//    }
//    public static int maxSelection(int[] a, int[] b, int sum, int count, int maxSum){
//        if(sum>maxSum){
//            return count;
//        }
//        if(a.length==0 || b.length==0){
//            return count;
//        }
//
//        int left = maxSelection(Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], count+1, maxSum);
//        int right = maxSelection(a, Arrays.copyOfRange(b, 1, b.length), sum+b[0], count+1, maxSum);
//        return Math.max(left, right);
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int g = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, g).forEach(gItr -> {
//            try {
//                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//                int n = Integer.parseInt(firstMultipleInput[0]);
//
//                int m = Integer.parseInt(firstMultipleInput[1]);
//
//                int maxSum = Integer.parseInt(firstMultipleInput[2]);
//
//                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Integer::parseInt)
//                        .collect(toList());
//
//                List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Integer::parseInt)
//                        .collect(toList());
//
//                int result = Result.twoStacks(maxSum, a, b);
//
//                bufferedWriter.write(String.valueOf(result));
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
