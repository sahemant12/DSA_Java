package com.Hemantsah._10.Stack_Queue;

public class _4_Stack_Main {
    public static void main(String[] args) throws Exception {
//        _2_Stack_CustomImplementation stack = new _2_Stack_CustomImplementation(2);
//        stack.push(23);
//        stack.push(34);
//        stack.push(35);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//    }

        //Dynamic stack
        _5_Dynamic_Stack stack = new _5_Dynamic_Stack(2);
        stack.push(23);
        stack.push(34);
        stack.push(35);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
