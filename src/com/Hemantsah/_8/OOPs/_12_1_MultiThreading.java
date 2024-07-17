package com.Hemantsah._8.OOPs;

public class _12_1_MultiThreading {
}
//create thread in java
//two-method
//(i) by extending thread class

class X1 extends Thread{
    @Override
    public void run(){ //override run method
        try{
            for(int i=1; i<=5; i++){ //child thread job to execute this program
                System.out.println("Hello");
                Thread.sleep(1000); //exception
            }
        }
       catch(InterruptedException e){
           System.out.println(e);
       }
    }

}
//two thread are present in up-down method and take only 5 second to execute both method
class Y1{
    //Every Java class has thread known as main(String[] args) Thread.
//    public static void main(String[] args) throws InterruptedException{ //main method job is to execute main method and define child thread and start
//        X1 t=new X1();
//        t.start(); //start method internally call run() method. From here two thread will execute simultanuously. (1) which excute run method. (2) which excute below code.   That's why in 5 sec both code get execute.
//        for(int i=1; i<=5; i++){
//            System.out.println("Everyone");
//            Thread.sleep(1000);
//        }
//    }                 //main() obj:  1.main()  2.child thread(t)
}

class Z1 extends Thread{
    public void onlyonethread(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println("He");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){

        }
    }
}
//only one thread is present in up-down method and will take 10 second to execute both method
class W1{
//    public static void main(String[] args) throws InterruptedException{ //main method job is to execute main method and define child thread and start
//        Z1 t=new Z1();
//        t.onlyonethread(); //first this method will execute after that below method will execute
//        for(int i=1; i<=5; i++){
//            System.out.println("one");
//            Thread.sleep(1000);
//        }
//    }
}



//(ii) by implementing runnable interface
class M1 implements Runnable { //Runnable Interface have only one method i.e run()
    public void run() { //override run method
        for (int i = 1; i <= 5; i++) { //child thread job to execute this program
            System.out.println("Nishu");
        }
    }
}
//both thread are run simultaneously
class N1{
//    public static void main(String[] args){
//       M1 r=new M1();
////       r.start();   start() method is present in thread not in Runnable(so we create object of Thread method to use start() method
//        Thread t=new Thread(r); //passing object ref. of class M1
//        t.start();
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Hemant");
//        }
//    }
}

////Thread Scheduler
class H1 extends Thread{
    public void run(){ //override method
        String n=Thread.currentThread().getName(); //method inside a thread i.e currentThread() which tell the current thread and store the name of current thread in 'n'
        for(int i=1; i<=3; i++){
            System.out.println(n);
        }
    }
}
class H2{
    public static void main(String[] args) {
        H1 t1=new H1(); //creating object for thread
        H1 t2=new H1(); //creating object for thread
        H1 t3=new H1(); //creating object for thread

        t1.setName("Thread 1"); //giving name to thread
        t2.setName("Thread 2"); //giving name to thread
        t3.setName("Thread 3"); //giving name to thread
        t1.start(); //new thread will create and execute
        t2.start();
        t3.start();

        String n=Thread.currentThread().getName(); //we do not need to set name of main thread becoz it is a part of JVM
        for(int i=1; i<=3; i++){
            System.out.println(n);
        }
        //now there are 4 thread in our program
    }
}

