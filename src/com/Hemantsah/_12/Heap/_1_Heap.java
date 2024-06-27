package com.Hemantsah._12.Heap;

import java.util.ArrayList;

public class _1_Heap<T extends Comparable<T>> {  //Make type of generic
    private ArrayList<T> list;

    public _1_Heap(){
        list = new ArrayList<>();
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    private int parent(int index){
        return (index - 1) / 2;
    }

    private int left(int index){
        return (2 * index) + 1;
    }

    private int right(int index){
        return (2 * index) + 2;
    }

    public void insert(T value){
        list.add(value);
        upheap(list.size()-1);
    }
    private void upheap(int index){
        if(index==0){
            return;
        }
        int parent = parent(index);
        if(list.get(parent).compareTo(list.get(index)) > 0){
            swap(parent,index);
            upheap(parent);
        }
    }
    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from an empty list");
        }

        T temp = list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0, last);
            downheap(0);
        }

        return temp;
    }
    private void downheap(int index){
        int left = left(index);
        int right = right(index);
        int smallest = index;
        if(left<list.size() && list.get(smallest).compareTo(list.get(left)) > 0){
            smallest = left;
        }
        if(right<list.size() && list.get(smallest).compareTo(list.get(right)) > 0){
            smallest = right;
        }
        if(smallest!=index){
            swap(smallest,index);
            downheap(smallest);
        }
    }
    public ArrayList<T> HeapSort() throws Exception{
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }
    }

