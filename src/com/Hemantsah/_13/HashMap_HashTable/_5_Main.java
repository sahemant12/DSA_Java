package com.Hemantsah._13.HashMap_HashTable;

public class _5_Main {
    public static void main(String[] args) {
        _4_HashMapImplementationFinal map = new _4_HashMapImplementationFinal();
        map.put("Hemant",11);
        map.put("Nishu","sah");
        map.put(12345,"fantus");
        System.out.println(map.toString());
        map.put("Nishu",124);
        System.out.println(map.toString());
        System.out.println(map.get("Hemant"));
        System.out.println(map.get("Hemnt"));
        map.removE(12345);
        System.out.println(map.toString());
        System.out.println("Hello: "+map);

    }
}
