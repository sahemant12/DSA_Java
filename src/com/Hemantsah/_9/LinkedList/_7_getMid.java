package com.Hemantsah._9.LinkedList;

public class _7_getMid {
    public static void main(String[] args) {
        _6_LL_setup_Node list = new _6_LL_setup_Node();
        list.insertLast(2);
        list.insertLast(5);
        list.insertLast(3);
        list.insertLast(9);
        list.insertLast(1);
        list.insertLast(6);
        list.display();

        list.findMid();
    }
}
