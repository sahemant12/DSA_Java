package com.Hemantsah._9.LinkedList;

public class _2_DoublyMain {
    public static void main(String[] args) {
        _2_DoublyLL list = new _2_DoublyLL();
//        list.insertFirst(2);
//        list.insertFirst(5);
//        list.insertFirst(3);
//        list.insertFirst(9);
//        list.insertFirst(1);
//        list.display();
//        list.displayReverse();
        list.insertLast(2);
        list.insertLast(5);
        list.insertLast(3);
        list.insertLast(9);
        list.insertLast(1);
        list.display();
        list.insert(100,5);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}
