package com.Hemantsah._14.Graph;

import java.util.ArrayList;
import java.util.List;

public class _1_Graph {
    protected int Vertices;
    private List<List<Integer>> adjList;

    public _1_Graph(int Vertices){
        this.Vertices = Vertices;
        adjList = new ArrayList<>(Vertices+1);
        for (int i = 0; i < Vertices+1; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    //get the adjancy list of given vertex
    public List<Integer> getAdjVertices(int vertex){
        return adjList.get(vertex);
    }
}

class mainGraph{
    public static void main(String[] args) {

    }
}
