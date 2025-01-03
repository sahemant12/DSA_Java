package com.Hemantsah._13.HashMap_HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _10_Extra {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter no. of string: ");
//        int n = in.nextInt();
//        System.out.println("Enter String: ");
//        for(int i=0; i<n; i++){
//            list.add(in.next());
//        }
        list.add("this");
        list.add("is");
        list.add("my");
        list.add("y");
        list.add("name");
//        list.add("this");
        list.add("hemant");
        list.add("sah");
        list.add("how");

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if(map.containsKey(str)){
                int count = map.get(str);
                map.remove(str);
                map.put(str, count+1);
            }else{
                map.put(str,1);
            }
        }
        list.clear();
        System.out.println(map);
        int max=0;
        for(Map.Entry<String, Integer> ma: map.entrySet()){
            if(ma.getValue()>max){
                max = ma.getValue();
            }
        }
        for(Map.Entry<String, Integer> ma: map.entrySet()){
            if(ma.getValue()==max){
                list.add(ma.getKey());
            }
        }
        System.out.println(list);
        if(list.size()==1){
            System.out.println(list.get(0));
        }else{
            //check for biggest string.
            String bigString = "";
            for (int i = 0; i < list.size(); i++) {
                int isBig = list.get(i).compareTo(bigString);
                bigString = isBig>=1? list.get(i): bigString;
            }
            System.out.println(bigString);
        }

    }
}
