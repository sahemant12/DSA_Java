package com.Hemantsah._13.HashMap_HashTable;

import java.util.HashSet;
import java.util.Iterator;

public class _2_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(25);
        set.add(45);
        set.add(47);
        set.add(25);
        set.add(24);
        System.out.println(set);

        //iterating each element
//        Iterator<Integer> itr = set.iterator();
//        while (itr.hasNext()) {
//            int element = itr.next();
//            System.out.println(element);
//        }
        for(int i:set){
            System.out.println(i);
        }
    }
}
