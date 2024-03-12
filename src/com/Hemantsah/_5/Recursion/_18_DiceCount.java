package com.Hemantsah._5.Recursion;
import java.util.ArrayList;
import java.util.List;
public class _18_DiceCount {
    public static void main(String[] args) {
//        Dice("",4);
        System.out.println(DiceReturnArrayList("",4));
    }

    private static List<String> DiceReturnArrayList(String p, int target) {
        if(target==0){
            List<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String>list = new ArrayList<>();
        for (int i = 1; i <= target; i++) {
            list.addAll(DiceReturnArrayList(p+i,target-i));
        }
        return list;
    }

    private static void Dice(String p, int target) {
        if(target==0){
            System.out.print(p+" ");
            return;
        }
        for (int i = 1; i <= target; i++) {
            Dice(p+i,target-i);
        }
    }
}
