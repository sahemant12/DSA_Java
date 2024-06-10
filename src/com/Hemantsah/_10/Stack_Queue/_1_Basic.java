package com.Hemantsah._10.Stack_Queue;
import java.util.*;

public class _1_Basic {
    public static void main(String[] args) {

//        Stack<Integer> stack = new Stack<>();  //Stack is a class
//        stack.push(5);
//        stack.push(8);
//        stack.push(90);
//        stack.push(99);
//        stack.push(20);
//        System.out.println(stack.pop());


        //insert and deletion take place from either side i.e front or back.
//        Queue<Integer> queue = new LinkedList<>(); //Queue is a interface(tells us what to do not how to do)
//        queue.add(5);
//        queue.add(8);
//        queue.add(90);
//        queue.add(99);
//        queue.add(20);
//        queue.add(5);
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());

        //insert and deletion take place from both side i.e front or back.
        Deque<Integer> deque = new ArrayDeque<>(); //ArrayDeque have no capacity resriction. They grow as necessary.
        deque.add(5);
        deque.add(12);
        deque.add(23);
        deque.add(3);
        System.out.println(deque);
        deque.addFirst(23);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);

    }
}

