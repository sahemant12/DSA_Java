package com.Hemantsah._6.Backtracking;

public class _6_SudukoSolverProblem {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.',},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.',},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.',},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3',},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1',},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6',},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.',},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5',},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9',}
        };
//         solveSudoku(board);
    }
    public static void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
    static void helper(char[][] board,int row, int col){
            if(col==board.length){
                print(board,row);
                return;
            }

            if(isSafe(board, row, col,'1')){

            }
        if (board[row][col] == '.') {
            board[row][col] = safeNumber(board, row, col);
            helper(board,0,col+1);
            board[row][col]='.';
        }else{
            helper(board,0,col+1);
        }

    }

    private static boolean isSafe(char[][] board,int row, int col,char ch){

        //for horizontal check
        for (int i=0; i< board.length; i++){
            if(board[row][i]==ch){
                return false;
            }
        }
        //for vertical check
        for (int i=0; i< board.length; i++){
            if(board[i][col]==ch){
                return false;
            }
        }

        //for 3X3 matrix check
        //1
        if(row>=0 && row<=2 && col>=0 && col<=2){
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <=2; j++) {
                    if(board[i][j]==ch){
                        return false;
                    }
                }
            }
        }
        //2
        if(row>=0 && row<=2 && col>=3 && col<=5){
            for (int i = 0; i <= 2; i++) {
                for (int j = 3; j <=5; j++) {
                    if(board[i][j]==ch){
                        return false;
                    }
                }
            }
        }
        //3
        if(row>=0 && row<=2 && col>=6 && col<=8){
            for (int i = 0; i <= 2; i++) {
                for (int j = 6; j <=8; j++) {
                    if(board[i][j]==ch){
                        return false;
                    }
                }
            }
        }
        //4
        if(row>=3 && row<=5 && col>=0 && col<=2){
            for (int i = 3; i <= 5; i++) {
                for (int j = 0; j <=2; j++) {
                    if(board[i][j]==ch){
                        return false;
                    }
                }
            }
        }
        //5
        if(row>=3 && row<=5 && col>=3 && col<=5){
            for (int i = 3; i <= 5; i++) {
                for (int j = 3; j <=5; j++) {
                    if(board[i][j]==ch){
                        return false;
                    }
                }
            }
        }
        //6
        if(row>=3 && row<=5 && col>=6 && col<=8){
            for (int i = 3; i <= 5; i++) {
                for (int j = 6; j <=8; j++) {
                    if(board[i][j]==ch){
                        return false;
                    }
                }
            }
        }
        //7
        if(row>=6 && row<=8 && col>=0 && col<=2){
            for (int i = 6; i <= 8; i++) {
                for (int j = 0; j <=2; j++) {
                    if(board[i][j]==ch){
                        return false;
                    }
                }
            }
        }
        //8
        if(row>=6 && row<=8 && col>=3 && col<=5){
            for (int i = 6; i <= 8; i++) {
                for (int j = 3; j <=5; j++) {
                    if(board[i][j]==ch){
                        return false;
                    }
                }
            }
        }
        //9
        if(row>=6 && row<=8 && col>=6 && col<=8){
            for (int i = 6; i <= 8; i++) {
                for (int j = 6; j <=8; j++) {
                    if(board[i][j]==ch){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    private static char safeNumber(char[][] board, int row, int col) {
        //for horizontal check
        for (int i=0; i< board.length; i++){
            if(board[row][i]=='1'){

            }else{
                board[row][i]='1';
            }
        }
        return '2';
    }

    static void print(char[][] board,int row){
        for (char i=0; i<board.length; i++){
            System.out.print(board[row][i]+" ");
        }
        System.out.println();
    }
}
