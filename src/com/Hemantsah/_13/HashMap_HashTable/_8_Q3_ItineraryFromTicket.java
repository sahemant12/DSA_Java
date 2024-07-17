package com.Hemantsah._13.HashMap_HashTable;

import java.util.HashMap;

public class _8_Q3_ItineraryFromTicket {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Che","Ben");
        map.put("Mum","Del");
        map.put("Goa","Che");
        map.put("Del","Goa");
        ItineraryTicket(map);
    }
    public static void ItineraryTicket(HashMap<String,String> map){
        //reverse the Map
        HashMap<String,String> revMap = new HashMap<>();
        for (String key: map.keySet()) {
            revMap.put(map.get(key),key);
        }
        //Finding Start City
        String getStartCity="";
        for (String key: map.keySet()) {
            if(!revMap.containsKey(key)){
                getStartCity=key;
            }
        }
//        //print the city
//        while(getStartCity!=null){
//            System.out.print(getStartCity+"--->");
//            getStartCity = map.get(getStartCity);
//        }
        //another way
        while(map.containsKey(getStartCity)){
            System.out.print(getStartCity+"--->");
            getStartCity = map.get(getStartCity);
        }
        System.out.println(getStartCity);
    }
}
