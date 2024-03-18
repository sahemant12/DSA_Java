package com.Hemantsah._6.Backtracking;

public class _5_NKnightsProblem {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board = new boolean[n][n];
        System.out.println( NKnights(board,0,0,n));
    }

    private static int NKnights(boolean[][] board, int row,int col, int knights) {
        if(knights==0){
            display(board);
            System.out.println();
            return 1;
        }
        if(row>=board.length && col>=board.length){
            return 0;
        }
        int count=0;
        if(col==board.length){
            NKnights(board,row+1,0,knights);
            return 0;
        }
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += NKnights(board, row, col+1, knights - 1);
                board[row][col] = false;
            }
                count += NKnights(board, row, col+1, knights);
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean[][] board, int row, int col){
        if(row>=0 && row< board.length && col>=0 && col<board.length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for(boolean col:row){
                if(col){
                    System.out.print("K ");
                }else{
                    System.out.print ("x ");
                }
            }
            System.out.println();
        }
    }
}

