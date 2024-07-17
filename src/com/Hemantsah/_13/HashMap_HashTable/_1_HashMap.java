package com.Hemantsah._13.HashMap_HashTable;

import java.util.HashMap;
import java.util.Map;

//Use HashMap when we use pairs. It have two things: key and value.
public class _1_HashMap {  //HashSet: contains the element with no duplicates
    public static void main(String[] args) {
        //Imp** Link: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
//        String name = "67890";
//        int code = name.hashCode(); //hashCode: return the hashCode value for this code
//        System.out.println(code);


        HashMap<String, Integer> map = new HashMap<>();
        map.put("Hemant",89);
        map.put("Fantus",97);
        map.put("Nishu",92);
        System.out.println(map.get("Hemant"));
        System.out.println(map.getOrDefault("sourabh",99));
        System.out.println(map.getOrDefault("Nishu",99));
        System.out.println(map);
        //iteration
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.print(e+" ");
            System.out.print(e.getValue());
            System.out.print(e.getKey());
        }
    }
}
