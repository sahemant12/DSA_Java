package com.Hemantsah._12.Heap;

public class _2_Main {
    public static void main(String[] args) throws Exception{
        _1_Heap<Integer> heap = new _1_Heap();  //This is generic
        heap.insert(43);
        heap.insert(34);
        heap.insert(11);
        heap.insert(16);
        heap.insert(9);
        heap.insert(60);
        heap.insert(6);
        heap.insert(90);
        System.out.println(heap.remove());
        System.out.println(heap.HeapSort());

    }
}
