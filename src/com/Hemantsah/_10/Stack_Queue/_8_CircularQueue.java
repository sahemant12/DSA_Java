package com.Hemantsah._10.Stack_Queue;

public class _8_CircularQueue extends _6_Queue_CustomImplementation{

    @Override
    public boolean enqueue(int item) throws Exception {
        if(isFull()){
            throw new Exception("Queue is full");
        }else if(front == -1 && rear == -1){
            front = rear = 0;
            data[rear] = item;
        }else{
            rear = (rear + 1) % data.length;
            System.out.println("Hello"+rear);
            data[rear] = item;
        }
        return true;
    }
    @Override
    public boolean isFull() {
        return front == (rear+1) % data.length;
    }

    @Override
    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }else if(front == rear){
            rear = -1;
            return data[front--];
        }else{
            int temp = front;
            front = (front+1) % data.length;
            return data[temp];
        }
    }

    @Override
    public void display() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int i = front;
//        for (int i = front; i!=rear; i = (i+1) % data.length) {
//            System.out.print(data[i]+" ");
//        }
        do{
            System.out.print(data[i]+" ");
            i = (i+1) % data.length;
        }while(i!=rear);
        System.out.println();
    }

}
