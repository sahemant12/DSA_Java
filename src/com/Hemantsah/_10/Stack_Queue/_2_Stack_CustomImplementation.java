package com.Hemantsah._10.Stack_Queue;

public class _2_Stack_CustomImplementation {
   protected int[] data;
   private static final int DEFAULT_SIZE = 10;
   int ptr = -1;
   public _2_Stack_CustomImplementation(){
       this(DEFAULT_SIZE);
   }
    public _2_Stack_CustomImplementation(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
       if(isFull()){
           System.out.println("Stack is full");
           return false;
       }
       ptr++;
       data[ptr] = item;
       return true;
    }
    public int pop() throws Exception {
       if(isEmpty()){
           throw new Exception("Cannot pop from an empty Stack");
       }
       return data[ptr--];
    }
    public int peek() throws _3_StackException {
        if(isEmpty()){
            throw new _3_StackException("Cannot peek from an empty Stack");
        }
       return data[ptr];
    }
    public boolean isFull() {
       return ptr == data.length - 1;
    }
    public boolean isEmpty() {
        return ptr == -1;
    }
}
