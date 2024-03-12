package com.Hemantsah._6.Backtracking;

import java.util.Arrays;

public class _3_IncludingAllPath_Backtracking {
    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},{true,true,true},{true,true,true}};
//        IncludingAllPathBacktracking("",maze,0,0);
        int[][] matrix = new int[maze.length][maze[0].length];
        allPathPrint("",maze,0,0,matrix,1);
    }
    private static void IncludingAllPathBacktracking(String p, boolean[][] maze, int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) { //for obstacles
            return;
        }
        maze[r][c]=false; //visited path mark as false
        if(r<maze.length-1){
            IncludingAllPathBacktracking(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            IncludingAllPathBacktracking(p+'R',maze,r,c+1);
        }
        if(r>0){
            IncludingAllPathBacktracking(p+'U',maze,r-1,c);
        }
        if(c>0){
            IncludingAllPathBacktracking(p+'L',maze,r,c-1);
        }
        //this line is where function will be over
        maze[r][c]=true; //so before function is return also change that were changed by that func
    }
    private static void allPathPrint(String p, boolean[][] maze, int r, int c,int[][] matrix,int count) {
        if(r==maze.length-1 && c==maze[0].length-1){
            matrix[r][c]=count;
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]) { //for obstacles
            return;
        }
        maze[r][c]=false; //visited path mark as false
        matrix[r][c]=count;
        if(r<maze.length-1){
            allPathPrint(p+'D',maze,r+1,c,matrix,count+1);
        }
        if(c<maze[0].length-1){
            allPathPrint(p+'R',maze,r,c+1,matrix,count+1);
        }
        if(r>0){
            allPathPrint(p+'U',maze,r-1,c,matrix,count+1);
        }
        if(c>0){
            allPathPrint(p+'L',maze,r,c-1,matrix,count+1);
        }
        maze[r][c]=true;
        matrix[r][c]=0;
    }
}
