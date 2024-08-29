package com.Hemantsah._6.Backtracking;

public class _4_NQueensProblem {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        System.out.println( NQueens(board,0));
    }

    private static int NQueens(boolean[][] board, int row) {
       if(row==board.length){
           display(board);
           System.out.println();
           return 1;
       }
       int count=0;
        //placing the queen and checking for every row and column
        for (int col = 0; col < board.length; col++) {
            //place the queen if it is safe
                if(isSafe(board,row,col)){
                    board[row][col]=true;
                    count+=NQueens(board,row+1);
                    board[row][col]=false;
                }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for (int i = row-1; i >=0 ; i--) {
            if(board[i][col]){
                return false;
            }
        }
        //diagonal left
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        //diagonal Right
        int maxRight = Math.min(row, board.length-col-1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for(boolean col:row){
                if(col){
                    System.out.print("Q ");
                }else{
                    System.out.print ("x ");
                }
            }
            System.out.println();
        }
    }
}


//import java.util.Arrays;

////self: Count
//public class _4_NQueensProblem {
//    public static void main(String[] args) {
//        int n=5;
//        boolean[][] board = new boolean[n][n];
//        System.out.println(NQueens(board,0));
//    }
//    public static int NQueens(boolean[][] board, int r){
//        if(r==board.length){
//            display(board);
//            System.out.println();
//            return 1;
//        }
//        int count =0;
//        for(int col=0; col<board[0].length; col++){
//            if(isSafe(board,r,col)){
//                board[r][col] = true;
//                count += NQueens(board,r+1);
//                board[r][col] = false;
//            }
//        }
//        return count;
//    }
//    public static boolean isSafe(boolean[][] board, int r, int c){
//        //check Straight
//        //MyMethod
////        int tr = r;
////        int tc = c;
////        while(tr>0){
////            if(board[--tr][tc]){
////                return false;
////            }
////        }
//        //KK Method
//        for(int i=r-1; i>=0; i--){
//            if(board[i][c]){
//                return false;
//            }
//        }
//
//        //check leftDiagonal
////        tr = r;
////        while(tr>0 && tc>0){
////            if(board[--tr][--tc]){
////                return false;
////            }
////        }
//        //KK Method
//        int leftMostRange = Math.min(r,c);
//        for(int i=1; i<=leftMostRange; i++){
//            if(board[r-i][c-i]){
//                return false;
//            }
//        }
//
//
//        //check rightDiagonal
////        tr = r;
////        tc = c;
////        while(tr>0 && tc<board.length-1){
////            if(board[--tr][++tc]){
////                return false;
////            }
////        }
//        //KK Method
//        int rightMostRange = Math.min(r,board.length-c-1);
//        for(int i=1; i<=rightMostRange; i++){
//            if(board[r-i][c+i]){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void display(boolean[][] board){
//        for(boolean[] row:board){
//            for(boolean isQueen:row){
//                if(isQueen){
//                    System.out.print("Q ");
//                }else{
//                    System.out.print(". ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

