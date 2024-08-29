package com.Hemantsah._6.Backtracking;

//public class _5_NKnightsProblem {
//    public static void main(String[] args) {
//        int n=3;
//        boolean[][] board = new boolean[n][n];
//        System.out.println( NKnights(board,0,0,n));
//    }
//
//    private static int NKnights(boolean[][] board, int row,int col, int knights) {
//        if(knights==0){
//            display(board);
//            System.out.println();
//            return 1;
//        }
//        if(row==board.length){
//            return 0;
//        }
//        int count=0;
//        if(col==board.length){
//            count+=NKnights(board,row+1,0,knights);
//            return count;
//        }
//            if (isSafe(board, row, col)) {
//                board[row][col] = true;
//                count += NKnights(board, row, col+1, knights - 1);
//                board[row][col] = false;
//            }
//                count += NKnights(board, row, col+1, knights);
//        return count;
//    }
//
//    private static boolean isSafe(boolean[][] board, int row, int col) {
//        if(isValid(board,row-2,col-1)){
//            if(board[row-2][col-1]){
//                return false;
//            }
//        }
//        if(isValid(board,row-2,col+1)){
//            if(board[row-2][col+1]){
//                return false;
//            }
//        }
//        if(isValid(board,row-1,col+2)){
//            if(board[row-1][col+2]){
//                return false;
//            }
//        }
//        if(isValid(board,row-1,col-2)){
//            if(board[row-1][col-2]){
//                return false;
//            }
//        }
//        return true;
//    }
//    static boolean isValid(boolean[][] board, int row, int col){
//        if(row>=0 && row< board.length && col>=0 && col<board.length){
//            return true;
//        }
//        return false;
//    }
//
//    private static void display(boolean[][] board) {
//        for(boolean[] row: board){
//            for(boolean col:row){
//                if(col){
//                    System.out.print("K ");
//                }else{
//                    System.out.print (". ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}



public class _5_NKnightsProblem {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board = new boolean[n][n];
        System.out.println(NKnights(board,0,0,n));
    }
    public static int NKnights(boolean[][] board, int r, int c, int n){
        if(n==0){
            printBoard(board);
            System.out.println();
            return 1;
        }
        if(r==board.length){
            return 0;
        }
        int count=0;
        if(c==board.length){
            count+=NKnights(board,r+1,0,n);
            return count;
        }
        if(isSafe(board,r,c)){
            board[r][c]=true;
            count+=NKnights(board,r,c+1,n-1);
            board[r][c]=false;
        }

        count+=NKnights(board,r,c+1,n);
        return count;
    }
    public static boolean isSafe(boolean[][] board, int r, int c){

        //check leftUp
        if(isvalid(board,r-1,c-2)){
            if(board[r-1][c-2]){
                return false;
            }
        }
        //check rightUp
        if(isvalid(board,r-1,c+2)){
            if(board[r-1][c+2]){
                return false;
            }
        }
        //check leftUp
        if(isvalid(board,r-2,c-1)){
            if(board[r-2][c-1]){
                return false;
            }
        }
        //check leftUp
        if(isvalid(board,r-2,c+1)){
            if(board[r-2][c+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isvalid(boolean[][] board, int r, int c){
        if(r>=0 && r<board.length && c>=0 && c<board.length){
            return true;
        }
        return false;
    }
    public static void printBoard(boolean[][] board){
        for(boolean[] row:board){
            for(boolean isKnight:row){
                if(isKnight){
                    System.out.print("K ");
                }else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}

