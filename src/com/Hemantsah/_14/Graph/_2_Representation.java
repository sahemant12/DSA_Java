package com.Hemantsah._14.Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class _2_Representation {
    public static void main(String[] args) {
        int v = 5;
        int e = 6;
//        adjancyMatrix(v, e);
        adjancyList(v, e);

    }
    public static void adjancyMatrix(int vertices, int edges){

        int[][] adj = new int[vertices+1][vertices+1];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < edges; i++) {
            int u,v;
            System.out.println("Enter edge: ");
            u= sc.nextInt();
            v= sc.nextInt();
            adj[u][v] =1;
            adj[v][u] =1;
        }
        //display
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[i].length; j++) {
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void adjancyList(int vertices, int edges){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(vertices+1);

        //initiazised arraylist with empty list
        for (int i = 0; i <= vertices; i++) {
            list.add(new ArrayList<>());
        }

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < edges; i++) {
            int u,v;
            System.out.println("Enter edge: ");
            u= sc.nextInt();
            v= sc.nextInt();
            list.get(u).add(v);
            list.get(v).add(u);
        }

        //display
        System.out.println(list);
    }
}
