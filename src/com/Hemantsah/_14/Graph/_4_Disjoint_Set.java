package com.Hemantsah._14.Graph;
import java.util.List;
import java.util.ArrayList;

//Use either rank or size. Don't use both simultaneous.
public class _4_Disjoint_Set {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();


    public _4_Disjoint_Set(int n){
        for(int i=0; i<n; i++){
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    public int findUParent(int node){
        if(node == parent.get(node)){
            return node;
        }
        int ulp = findUParent(parent.get(node));
        parent.set(node, ulp);
        return ulp;
    }

    public void unionByRank(int u, int v){
        int ulp_u = findUParent(u);
        int ulp_v = findUParent(v);
        if(ulp_u == ulp_v){
            return;
        }

        if(rank.get(ulp_u) < rank.get(ulp_v)){
            parent.set(ulp_u, ulp_v);
        }else if(rank.get(ulp_u) > rank.get(ulp_v)){
            parent.set(ulp_v, ulp_u);
        }else{
            parent.set(ulp_v, ulp_u);
            rank.set(ulp_u, rank.get(ulp_u)+1);
        }
    }
    public void unionBySize(int u, int v){
        int ulp_u = findUParent(u);
        int ulp_v = findUParent(v);
        if(ulp_u == ulp_v){
            return;
        }
        if(size.get(ulp_u) < size.get(ulp_v)){
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v)+size.get(ulp_u));
        }else{
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_v)+size.get(ulp_u));
        }
    }
}

class Main{
    public static void main(String[] args) {
        _4_Disjoint_Set djset = new _4_Disjoint_Set(8);
        djset.unionBySize(1,2);
        djset.unionBySize(2,3);
        djset.unionBySize(4,5);
        djset.unionBySize(6,7);
        djset.unionBySize(5,6);

        if(djset.findUParent(3) == djset.findUParent(7)){
            System.out.println("Same");
        }else{
            System.out.println(djset.findUParent(3)+ " "+djset.findUParent(7)+" "+ "Not Same");
        }
        djset.unionBySize(3,7);

        if(djset.findUParent(3) == djset.findUParent(7)){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }
    }
}
