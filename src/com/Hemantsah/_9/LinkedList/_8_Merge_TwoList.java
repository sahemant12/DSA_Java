package com.Hemantsah._9.LinkedList;

public class _8_Merge_TwoList {
    public static void main(String[] args) {
        _6_LL_setup_Node list1 = new _6_LL_setup_Node();
        _6_LL_setup_Node list2 = new _6_LL_setup_Node();


        list1.insertLast(2);
        list1.insertLast(4);
        list1.insertLast(9);
        list1.insertLast(10);
        list2.insertLast(3);
        list2.insertLast(5);
        list2.insertLast(6);
        list2.insertLast(7);
        list1.display();
        list2.display();
        _6_LL_setup_Node list3 = _6_LL_setup_Node.mergeLL(list1, list2);
        list3.display();
    }
}
