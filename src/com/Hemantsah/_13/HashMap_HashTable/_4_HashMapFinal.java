package com.Hemantsah._13.HashMap_HashTable;

import java.util.ArrayList;
import java.util.LinkedList;

public class _4_HashMapFinal<K,V> {
    ArrayList<LinkedList<Entity>> list;
}
 class Entity{
    String key;
    String value;

    public Entity(String key, String value){
        this.key=key;
        this.value=value;
    }
}