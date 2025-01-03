package com.Hemantsah._13.HashMap_HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _11_Practice {
    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1,"Hemant");
//        map.put(2,"Fanatus");
//        map.put(3,"Nishu");
//        map.put(4,"Himanshu");
//        map.put(5,"Shrey");
//
////        for(Map.Entry<Integer, String>e: map.entrySet()){
//////            System.out.print(e+" ");
////            System.out.print(e.getKey()+" ");
//////            System.out.print(e.getValue()+" ");
////        }
////        for(String i:map.values()){
////            System.out.println(i);
////        }
//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(1);
//        set.add(1);
//        set.add(1);
//        set.add(2);
////        set.remove(1);
//        System.out.println(set.size());

        HashMap<String, String> map = new HashMap<>();
//        int[] arr = {1,3,2,5,1,3,1,5,1,5,2,2};
//        for(int i=0; i<arr.length; i++){
//            int ele = arr[i];
//            if(map.containsKey(ele)){
//                map.put(ele, map.get(ele)+1);
//            }else{
//                map.put(ele,1);
//            }
//        }
//        System.out.println(map);
//        int n = arr.length;
////        for(Map.Entry<Integer, Integer>e: map.entrySet()){
////            if(e.getValue()>=n/3){
////                System.out.print(e.getKey()+" ");
////            }
////        }
//        for(int i:map.keySet()){
//            if(map.get(i)>=3){
//                System.out.print(i+" ");
//            }
//        }
//        int[] arr1 = {7,3,9};
//        int[] arr2 = {6,3,9,2,9,4};
        map.put("Che","Ben");
        map.put("Mum","Del");
        map.put("Goa","Che");
        map.put("Del","Goa");

        HashMap<String, String> revMap = new HashMap<>();
        for(String i:map.keySet()){
            revMap.put(map.get(i),i);
        }
        String startCity="";
        for(String i:map.keySet()){
            if(!revMap.containsKey(i)){
                startCity = i;
                break;
            }
        }
        ArrayList<String> list = new ArrayList<>();

        while(startCity!=null){
            list.add(startCity);
            startCity = map.get(startCity);
        }
        System.out.println(list);
    }
}
