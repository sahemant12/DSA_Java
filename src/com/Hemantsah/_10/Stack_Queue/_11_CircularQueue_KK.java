package com.Hemantsah._10.Stack_Queue;

public class _11_CircularQueue_KK {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    int front = 0;
    int size=0;
    public _11_CircularQueue_KK(int size) {
        this.data = new int[size];
    }
    public _11_CircularQueue_KK() {
        this(DEFAULT_SIZE);
    }
    public boolean isFull() {
        return size == data.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        size++;
        data[end++] = item;
        end = end % data.length;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front];
        front++;
        size--;
        front = front % data.length;
        return removed;
    }
}
