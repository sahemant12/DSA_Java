package com.Hemantsah._10.Stack_Queue;
import java.util.Stack;

public class _12_ImplementQueue_UsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public _12_ImplementQueue_UsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }
    public int remove(){
        if(empty()){
            return -1;
        }
        while(!first.empty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.empty()){
            first.push(second.pop());
        }
        return removed;
    }
    public boolean empty(){
        return first.isEmpty();
    }
    public int peek(){
        if(empty()){
            return -1;
        }
        while(!first.empty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while(!second.empty()){
            first.push(second.pop());
        }
        return peeked;
    }
}

//Remove Efficient do it by yourself
