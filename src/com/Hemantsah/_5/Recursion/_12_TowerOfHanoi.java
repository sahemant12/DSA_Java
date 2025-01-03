package com.Hemantsah._5.Recursion;

//public class _12_TowerOfHanoi {
//    public static void main(String[] args) {
//        int noOfDisk=3;
//       TowerOfHanoi(noOfDisk,"A","B","C");
//    }
//
//    private static void TowerOfHanoi(int n,String a,String b,String c) { //No. of movement: 2^n -1
//        if(n==1){
//            System.out.println(a+"->"+b);
//            return;
//        }else{
//            TowerOfHanoi(n-1,a,b,c);
//            TowerOfHanoi(1,a,c,b);
//            TowerOfHanoi(n-1,c,a,b);
//        }
//    }
//}

//public class _12_TowerOfHanoi {
//    public static void main(String[] args) {
//        int n = 3;
//        int moves = TowerOfHanoi(n, "A", "B", "C");
//        System.out.println(moves);
//    }
//
//    private static int TowerOfHanoi(int n, String A, String B, String C) {
//        if(n==1){
//            System.out.println(A+"-->"+C);
//            return 1;
//        }
//        return TowerOfHanoi(n-1, A, C, B) + TowerOfHanoi(1, A, B, C) + TowerOfHanoi(n-1, B, A, C);
//    }
//}


public class _12_TowerOfHanoi {
    public static void main(String[] args) {
        int n = 4;
        int moves = TowerOfHanoi(n, "A", "B", "C", 0);
        System.out.println(moves);
    }

    private static int TowerOfHanoi(int n, String A, String B, String C, int move) {
        if(n==1){
            System.out.println(A+"-->"+C);
            return move+1;
        }
        return TowerOfHanoi(n-1, A, C, B, move) + TowerOfHanoi(1, A, B, C, move) + TowerOfHanoi(n-1, B, A, C, move);
    }
}























