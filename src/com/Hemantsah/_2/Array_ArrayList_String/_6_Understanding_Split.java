package com.Hemantsah._2.Array_ArrayList_String;

import java.util.Arrays;

public class _6_Understanding_Split {
    public static void main(String[] args) {
        String name = " My Name       is Hemant       Sah  ";
        String[] seperate = name.trim().split("\\s+");
        System.out.println(Arrays.toString(seperate));
    }
}
