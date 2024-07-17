package com.Hemantsah._14.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _3_Traversal {
    public static void main(String[] args) {
        //create the instance of graph
        _1_Graph graph = new _1_Graph(9);
        graph.addEdge(1,2);
        graph.addEdge(1,6);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(6,7);
        graph.addEdge(6,9);
        graph.addEdge(4,5);
        graph.addEdge(7,8);
        graph.addEdge(5,8);

        //create the instance of _3_Traversal
        _3_Traversal bfs = new _3_Traversal();
        bfs.BFS(graph, 1);
        System.out.println();
        //create the instance of _3_Traversal
        _3_Traversal dfs = new _3_Traversal();
        dfs.DFS(graph,1);

        //using recursion
        System.out.println();
        dfs.recursionDFS(graph,1);
    }
    public void BFS(_1_Graph graph, int root){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.Vertices+1];
        q.offer(root);
        visited[root]=true;
        while(!q.isEmpty()){
            int peek = q.poll();
            System.out.print(peek+" ");
                for (int i:graph.getAdjVertices(peek)) {
                    if(!visited[i]){
                        q.offer(i);
                        visited[i]=true;
                }
            }
        }
    }
    public void DFS(_1_Graph graph, int root){
        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[graph.Vertices+1];
        s.push(root);
        visited[root]=true;
        while(!s.isEmpty()){
            int peek = s.pop();
            System.out.print(peek+" ");
            for(int i:graph.getAdjVertices(peek)) {
                if (!visited[i]) {
                    s.push(i);
                    visited[i] = true;
                }
            }
        }
    }
    boolean[] visited;
    public void recursionDFS(_1_Graph graph, int root){
        visited = new boolean[graph.Vertices+1];
        visited[0] = true;
        DFSrecursion(graph,root);
    }
    public void DFSrecursion(_1_Graph graph, int root){
        visited[root] = true;
        System.out.print(root+" ");
        for(int i:graph.getAdjVertices(root)) {
            if (!visited[i]) {
                DFSrecursion(graph, i);
            }
        }
    }
}
