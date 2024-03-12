package com.Hemantsah._6.Backtracking;

public class _2_Maze_with_Obstacles {
    public static void main(String[] args) {
//        boolean[][] maze = {{true,true,true},{true,false,true},{true,true,true}};
        boolean[][] maze = {{true,true,true},{true,true,true},{true,true,true}};

//        printPathWithObstacles("",maze,0,0);
        IncludingAllPath("",maze,0,0); //Goes into the infinite loop
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
