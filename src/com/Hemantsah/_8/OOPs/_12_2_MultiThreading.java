package com.Hemantsah._8.OOPs;

public class _12_2_MultiThreading {
}
//join() method
class A4 extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=1; i<=3; i++){
            System.out.println(n);
        }
    }
}
class B4{
    public static void main(String[] args) throws InterruptedException {
        A4 t1=new A4();
        A4 t2=new A4();
        A4 t3=new A4();
        t1.setName("Thread 1");  //method of thread
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t1.join(); //now thread1 will always execute first
        t2.start();
        t3.start();
    }
}

//yield() method
class thread1 extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=1; i<=3; i++){
            System.out.println(n);
            Thread.yield();
        }
    }
}
class thread2 extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=1; i<=3; i++){
            System.out.println(n);
        }
    }
}
class B3{
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}


//priority
class A2 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
class B2{
    public static void main(String[] args) {
        A2 t1=new A2();
        A2 t2=new A2();
        A2 t3=new A2();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(2);
        t2.setPriority(10);
        t3.setPriority(5);

        t1.start();  //two job (i)start the thread (ii) call the run method internally
        t2.start();
        t3.start();
    }
}

