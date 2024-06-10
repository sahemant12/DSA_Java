package com.Hemantsah._9.LinkedList;

public class _5_Length_of_cycle {
    public static void main(String[] args) {
        _1_SinglyLL list = new _1_SinglyLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.insertAndFormCycle(8,4);
        System.out.println(list.lengthOfCycle());
    }

//    public class ListNode{
//        public int val;
//        public ListNode next;
//        public ListNode(int val) {
//
//            this.val = val;
//        }
//        public ListNode(){
//
//        }
//
//        public ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//        }
//
//    }
}
