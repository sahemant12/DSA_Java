package com.Hemantsah._9.LinkedList;

public class _9_Reverse_LL {
    public static void main(String[] args) {
        _6_LL_setup_Node list = new _6_LL_setup_Node();


        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(9);
        list.insertLast(10);
        list.insertLast(34);
        list.display();
//        list.reverseLL();
//        list.display();
//        list.helperReverseLLRcursive();
//        list.display();
        list.reverseLLKunalKushwahaWay();
        list.display();
    }
}
