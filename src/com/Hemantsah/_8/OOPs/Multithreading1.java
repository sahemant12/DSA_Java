//create thread in java
//two-method
//(i) by extending thread class

//class AAA extends Thread{
//    public void run(){ //override run method
//        try{
//            for(int i=1; i<=5; i++){ //child thread job to execute this program
//                System.out.println("Hello");
//                Thread.sleep(1000); //exception
//            }
//        }
//       catch(InterruptedException e){
//
//       }
//    }
//}
////two thread are present in up-down method and take only 5 second to execute both method
//class BBB{
//    public static void main(String[] args) throws InterruptedException{ //main method job is to execute main method and define child thread and start
//        AAA t=new AAA();
//        t.start(); //from this line there are 2 thread
//        for(int i=1; i<=5; i++){
//            System.out.println("Everyone");
//            Thread.sleep(1000); //exception
//        }
//    }
//}

//class AAA extends Thread{
//    public void onlyonethread(){
//        try{
//            for(int i=1; i<=5; i++){
//                System.out.println("Hello");
//                Thread.sleep(1000); //exception
//            }
//        }
//        catch(InterruptedException e){
//
//        }
//    }
//}
////only one thread is present in up-down method and will take 10 second to execute both method
//class BBB{
//    public static void main(String[] args) throws InterruptedException{ //main method job is to execute main method and define child thread and start
//        AAA t=new AAA();
//        t.onlyonethread(); //first is method will execute after that below method will execute
//        for(int i=1; i<=5; i++){
//            System.out.println("Everyone");
//            Thread.sleep(1000); //exception
//        }
//    }
//}



//(ii) by implementing runnable interface

//class AAAA implements Runnable {
//    public void run() { //override run method
//        for (int i = 1; i <= 5; i++) { //child thread job to execute this program
//            System.out.println("Nishu");
//
//        }
//    }
//}
////both thread are run simulatesilily
//class BBBB{
//    public static void main(String[] args){
//       AAAA r=new AAAA();
////       r.start();   start() method is present in thread not in Runnable(so we create object of Thread method to use start() method
//        Thread t=new Thread(r); //passing object ref. of class AAAA
//        t.start();
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Hemant");
//        }
//    }
//}

//Thread Scheduler
//class A extends Thread{
//    public void run(){ //override method
//        String n=Thread.currentThread().getName(); //method inside a thread i.e currentThread() which tell the current thread and store the name of current thread in 'n'
//        for(int i=1; i<=3; i++){
//            System.out.println(n);
//        }
//    }
//}
//class B{
//    public static void main(String[] args) {
//        A t1=new A(); //creating object for thread
//        A t2=new A(); //creating object for thread
//        A t3=new A(); //creating object for thread
//
//        t1.setName("Thread 1"); //giving name to thread
//        t2.setName("Thread 2"); //giving name to thread
//        t3.setName("Thread 3"); //giving name to thread
//        t1.start();
//        t2.start();
//        t3.start();
//
//        String n=Thread.currentThread().getName(); //we do not need to set name of main thread becoz it is a part of JVM
//        for(int i=1; i<=3; i++){
//            System.out.println(n);
//        }
//        //now there are 4 thread in our program
//    }
//}
