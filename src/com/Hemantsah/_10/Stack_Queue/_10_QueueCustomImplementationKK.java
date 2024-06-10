package com.Hemantsah._10.Stack_Queue;

public class _10_QueueCustomImplementationKK {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    public _10_QueueCustomImplementationKK(int size) {
        this.data = new int[size];
    }
    public _10_QueueCustomImplementationKK() {
        this(DEFAULT_SIZE);
    }
    public boolean isFull() {
        return end == data.length;
    }
    public boolean isEmpty() {
        return end == 0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        for (int i = 0; i < end-1; i++) {
            data[i] = data[i+1];
        }
        end--;
        return removed;
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }


}
