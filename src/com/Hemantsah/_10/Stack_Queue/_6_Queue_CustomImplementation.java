package com.Hemantsah._10.Stack_Queue;

import java.util.Arrays;

public class _6_Queue_CustomImplementation {
    protected int[] data;
    private static final int DEFAULT_SIZE = 4;
    int front = -1; //for deletion
    int rear = -1; //for insertion

    public _6_Queue_CustomImplementation(int size) {
        this.data = new int[size];
    }
    public _6_Queue_CustomImplementation() {
       this(DEFAULT_SIZE);
    }
    public boolean enqueue(int item) throws Exception {
        if(isFull()){
            throw new Exception("Queue is full");
        }else if(front == -1 && rear == -1){
            front = rear = 0;
            data[rear] = item;
        }else{
            data[++rear] = item;
        }
        return true;
    }
    public boolean isFull() {
        return rear == data.length -1;
    }
    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }else if(front == rear){
            rear = -1;
            return data[front--];
        }else{
            return data[front++];
        }

    }
    public boolean isEmpty() {
        return front == -1;
    }

    public void display() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty by Hemant nishu sah");
        }
        for (int i = front ; i <=rear ; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }
}
