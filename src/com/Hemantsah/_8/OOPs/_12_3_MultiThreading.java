package com.Hemantsah._8.OOPs;

public class _12_3_MultiThreading {
}
//class Bus implements Runnable{
//    int passenger,seat=2;
//    Bus(int passenger){
//        this.passenger=passenger;
//    }
////in run() method all the three thread are passed simultaneously thats why seat available is 1 but all three person's ticket is booked so use synchronization to avoid this type of error
//    //after using synchronized only one thread will enter at a time may be p1 or p2 or p3
//    public synchronized void run(){  //Runnable interface have only one method i.e run
//        String name=Thread.currentThread().getName();
//        if(seat>=passenger){
//            System.out.println(name+" "+"Seat has been Booked");
//            seat-=passenger;
//        }else {
//            System.out.println("Seat is not available");
//        }
//    }
//}
//class customer{
//    public static void main(String[] args) {
//
//        Bus b=new Bus(1); //passing number of passenger
//
//        Thread p1=new Thread(b);
//        Thread p2=new Thread(b);
//        Thread p3=new Thread(b);
//
//        p1.setName("Hemant"); //passenger
//        p2.setName("Shrey");  //passenger
//        p3.setName("Piyush"); //passenger
//
//        p1.start();
//        p2.start();
//        p3.start();
//    }
//}

//method level synchronization : only one thread will enter inside the synchronization rest thread are wait outside the method
//For example
//class Table{
//    public synchronized void printTable(int n){
//        for(int i=1; i<=10; i++){
//            System.out.println(n*i);
//        }
//    }
//}
//class thread1 extends Thread{
//    Table t; //reference of table class
//    thread1(Table t){ //by constructor we are passing object reference of table t
//        this.t=t;
//    }
//    public void run(){ //method inside a Thread Class
//        t.printTable(9);
//    }
//}
//class thread2 extends Thread{
//    Table t; //reference of table class
//    thread2(Table t){ //by constructor we are passing object reference of table t
//        this.t=t;
//    }
//    public void run(){ //method inside a Thread Class
//        t.printTable(1);
//    }
//}
//class print{
//    public static void main(String[] args) {
//        Table obj=new Table();
//        thread1 t1=new thread1(obj);
//        thread2 t2=new thread2(obj);
//        t1.start(); t2.start();
//    }
//}

//block level synchronization : in a block level synchronization the entire method is not synchronised only a portion of method is synchronized
//for example
//syntax     synchronized(this){


//    }




//static synchronization
//class Bank extends Thread{
//    int balance=5000;
//    int withdraw;
//    Bank(int withdraw){
//        this.withdraw=withdraw;
//    }
//
//    public synchronized void run(){
//        String name=Thread.currentThread().getName();
//        if(balance>=withdraw){
//            System.out.println(name+" "+"withdraw money");
//            balance-=withdraw;
//        }else{
//            System.out.println("Insufficient balance");
//        }
//    }
//}
//class customer{
//    public static void main(String[] args) {
//        Bank r=new Bank(5000);
//        Thread t1=new Thread(r);
//        Thread t2=new Thread(r);
//        t1.setName("Customer 1");
//        t2.setName("Customer 2");
//        t1.start(); t2.start(); //it will call run method internally
//    }
//}


class Bank extends Thread{
    static int balance=5000;
    static int withdraw;
    Bank(int withdraw){
        this.withdraw=withdraw;
    }

    public static synchronized void fun(){ //we can't override the static method
        String name=Thread.currentThread().getName();
        if(balance>=withdraw){
            System.out.println(name+" "+"withdraw money");
            balance-=withdraw;
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public void run(){
        fun();
    }
}
class customer{
    public static void main(String[] args) {
        Bank obj1=new Bank(5000);  //obj1 has 1 lock
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj1);
        t1.setName("Customer 1");
        t2.setName("Customer 2");
        t1.start(); t2.start(); //it will call run method internally

        //we are creating 2nd object of Bank and thus two thread will pass simultaneously thus synchronization is fail so we use static before synchronization to remove this type of error
        Bank obj2=new Bank(5000);  //obj2 has 1 lock
        Thread t3=new Thread(obj2);
        Thread t4=new Thread(obj2);
        t3.setName("Customer 3");
        t4.setName("Customer 4");
        t3.start(); t4.start();
    }
}

