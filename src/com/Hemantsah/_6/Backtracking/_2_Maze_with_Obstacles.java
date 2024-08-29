package com.Hemantsah._6.Backtracking;

import java.util.ArrayList;

public class _2_Maze_with_Obstacles {
    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},{true,false,true},{true,true,true}};
//        boolean[][] maze = {{true,true,true},{true,true,true},{true,true,true}};

//         printPathWithObstacles_("",maze,3,3);
//        System.out.println(_printPathWithObstacles_("",maze,0,0));

//        printPathWithObstacles("",maze,0,0);

//        IncludingAllPath("",maze,0,0); //Goes into the infinite loop
    }

    private static ArrayList<String> _printPathWithObstacles_(String p, boolean[][] maze, int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }
        if(!maze[r][c]){ //More shortcut
            return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();
        if(r<maze.length-1){
            list.addAll(_printPathWithObstacles_(p+'V',maze,r+1,c));
        }
        if(c<maze[0].length-1){
            list.addAll(_printPathWithObstacles_(p+'H',maze,r,c+1));
        }
        return list;
    }

    private static void printPathWithObstacles_(String p, boolean[][] maze, int r, int c) {
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(!maze[r-1][c-1]){
            return;
        }
        if(r>1){
            printPathWithObstacles_(p+"D",maze,r-1,c);
        }
        if(c>1){
            printPathWithObstacles_(p+"R",maze,r,c-1);
        }
    }

    private static void printPathWithObstacles(String p, boolean[][] maze, int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){ //More shortcut
            return;
        }
//        if(maze[r][c] && r<maze.length-1){
//            printPathWithObstacles(p+'V',maze,r+1,c);
//        }
//        if(maze[r][c] && c<maze[0].length-1){
//            printPathWithObstacles(p+'H',maze,r,c+1);
//        }
        if(r<maze.length-1){
            printPathWithObstacles(p+'V',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            printPathWithObstacles(p+'H',maze,r,c+1);
        }
    }
    private static void IncludingAllPath(String p, boolean[][] maze, int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) {
            return;
        }
        if(r<maze.length-1){
            IncludingAllPath(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            IncludingAllPath(p+'R',maze,r,c+1);
        }
        if(r>0){
            IncludingAllPath(p+'U',maze,r-1,c);
        }
        if(c>0){
            IncludingAllPath(p+'L',maze,r,c-1);
        }
    }
}
