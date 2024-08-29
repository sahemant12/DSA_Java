package com.Hemantsah;

public class extra {
    public static void main(String[] args) {
        String name = "Hemant Sah";
//        for(int i=0; i<name.length(); i++){
//            char ch = Character.toLowerCase(name.charAt(i));
//            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//                System.out.print(ch+" ");
//            }
//        }
//        String str = Integer.toString(1234);
//        int num = Integer.parseInt(str);
//        System.out.println(str+" "+num);


//        char ch = '1';
//        int num1 = ch - '0';
//        int num2 = ch + '0';
//        char ch2 = (char)num2;
//        System.out.println(num1+" "+num2+" "+ch2);

        //convert a, b into 0,1
        int num1 = 'a' - 'a';
        int num2 = 'b' - 'a';
        System.out.println(num1+" "+num2);

        //convert 0,1 into a,b
        char ch1 = (char)(0 + 97);
        char ch2 = (char)(1 + 97);
        System.out.println(ch1+" "+ch2);

    }
}
