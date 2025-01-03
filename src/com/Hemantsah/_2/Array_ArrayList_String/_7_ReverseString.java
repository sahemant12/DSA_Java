package com.Hemantsah._2.Array_ArrayList_String;

import java.util.LinkedHashMap;

public class _7_ReverseString {
//    public static void main(String[] args) {
//        String str = "hemant_Sah$nishu#sah!piyush";
////        String rev = "tnameh_has$uhsin#has!hsuyip";
//
//        char[] ch = str.toCharArray();
//        StringBuilder sb = new StringBuilder("");
//        for(int i=0; i<ch.length; i++){
//            char c = ch[i];
//            if(Character.isLetterOrDigit(c)){
//                sb.append(ch);
//            }
//        }
//        sb.reverse();
//
//    }
public static void main(String[] args) {
    String str = "hemant_Sah$nishu#sah!piyush";

    // Convert the input string to a character array for easy manipulation
    char[] strArray = str.toCharArray();

    // A StringBuilder to store only the alphanumeric characters
    StringBuilder alphanumeric = new StringBuilder();

    // Step 1: Extract alphanumeric characters
    for (char c : strArray) {
        if (Character.isLetterOrDigit(c)) {
            alphanumeric.append(c);
        }
    }

    // Step 2: Reverse the alphanumeric characters
    alphanumeric.reverse();

    // Step 3: Create a new string, inserting reversed alphanumerics and keeping special characters in place
    int index = 0;
    for (int i = 0; i < strArray.length; i++) {
        if (Character.isLetterOrDigit(strArray[i])) {
            strArray[i] = alphanumeric.charAt(index);
            index++;
        }
    }

    // Convert the modified character array back to a string
    String reversedString = new String(strArray);

    // Output the reversed string
    System.out.println("Reversed String: " + reversedString);
}
}
