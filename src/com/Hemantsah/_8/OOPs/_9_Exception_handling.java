package com.Hemantsah._8.OOPs;
//1. It helps in maintaining the normal flow of the application even when unexpected events or errors occur. Java provides a robust and flexible framework for handling exceptions, using try-catch blocks, throw, throws, and finally keywords.
//2. Exception Hierarchy: In Java, all exceptions are derived from the Throwable class. There are two main subclasses of Throwable class:
//      1. Exception(Checked Exception except Arthimetic Exception): Represents conditions that a reasonable application might want to catch (e.g., IOException).
//                  1. Runtime Exception(divided by 0, IndexOutOfBound)  2. IO Exception  3. SQL Exception  4. Interrupted Exception   5. classnotfound Exception
//           Runtime Exception: 1.Arithmetic Exception  2.NullPointer Exception 3.NumberFormat Exception  4.IndexOutOfBound Exception(Array, String)
//     2. Error(Unchecked Exception): Represents serious problems that a reasonable application should not try to catch (e.g., OutOfMemoryError).
//            1. StackOverFlow, 2. Out of Memory, 3.IO Error, 4.Linkage Error

//Within Exception, there are two categories:
//
//Checked Exceptions: Exceptions that are checked at compile-time (e.g., IOException, SQLException). These must be either caught or declared in the method signature using throws.
//Unchecked Exceptions: Exceptions that are not checked at compile-time, also known as runtime exceptions (e.g., NullPointerException, ArithmeticException). These are derived from RuntimeException.
//simple e.g:  1.Checked Exceptions(checked at compile time):file not found  2.unChecked Exceptions(not checked at compile time):Arithmetic Exception(e.g: divide by 0, IndexOutOfBound

//Technique to work with Exception: Main diff b/w 1 & 2: try-catch maintain the flow of prgm whereas throw-throws explicitly throw an exception(flow of prgm is stop).
//1. try-catch block: when there is predefined exception
//2. throw-throws: when there is userdefined exception(Exception defined by us)
//3. finally: whether exception or not but it definitely execute.
public class _9_Exception_handling {
}

//user define exception
//class InvalidAgeException extends Exception{
//    InvalidAgeException(String msg){
//        System.out.println(msg);
//    }
//}
//
// class CreateUserDefineException {
//    public static void main(String[] args) {
//        try{
//            vote(13);
//        }
//        catch(Exception e){
//            System.out.println("");
//        }
//    }
//     public static void vote(int age) throws InvalidAgeException{
//
//         if(age<18){
//             throw new InvalidAgeException("Not eligible for voting"); //we create our own exception object OR in my words: We create our own Exception class by inherit Exception class.
//         }else{
//             System.out.println("Eligible for voting");
//         }
//     }
//}




//class demo{
//    public static void main(String[] args) {
//        System.out.println(10/0); //exception created by java
//      throw new ArithmeticException("It is exception"); //exception created by us
//    }
//}

//try-catch vs throws
//class Demo21{
//    public static void main(String[] args) throws InterruptedException //we want JVM to handle this exception
//    {
//        for(int i=1; i<=10; i++){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//    }
//}
//class Demo22{
//    public static void main(String[] args) //we want ourselves to handle this exception
//    {
//        for(int i=1; i<=10; i++){
//            try{
//                System.out.println(i);
//                Thread.sleep(1000);
//            }
//            catch(InterruptedException e){
//
//            }
//
//        }
//    }
//}


////throw vs throws
//class test{
//    void div(int a,int b) throws ArithmeticException //we declared the exception and bypass it to the caller
//     {
//        if(b==0){
//            throw new ArithmeticException("Hello bab"); //we don't want to handle this exception so that we can bypass it to the caller ie. JVM
//            // throw keyword is used to create exception object so that we can explicitly throw it to the JVM
//        }else{
//            int c=a/b;
//            System.out.println(c);
//        }
//
//
//    }
//    public static void main(String[] args) {
//        test te=new test();
//
//        try{
//            te.div(4,0);
//        }
//        catch(ArithmeticException e){
//            System.out.println("num is divisible by 0");
//        }
//        System.out.println("AM I PRINTING");
//
//    }
//}


//This E.g fully cleared the diff. b/w try-catch and throw-throws: throw(We can create our own exception object)
class Mai {
    public static void main(String[] args) {
        int result;
        try {
            result = divide(10, 0); // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            result = divide(10, 2); // This will work fine
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}






////Exception Propagation
//class propagation{
//    public static void main(String[] args){
//        try{
//            m1(); //is main method has the technique to handle the exception? no then it will go to the JVM to handle the exception
//        }
//        catch(ArithmeticException e){
//            System.out.println("main method handle the exception");
//        }
//    }
//
//   static void m1() {
//       try{
//            m2(); //is m1() method has the technique to handle the exception? no then go to the method from where it is called
//        }
//          catch(ArithmeticException e){
//             System.out.println("m1 method handle the exception");
//         }
//    }
//
//    static void m2() {
//        System.out.println(10/0);  //is m2() method has the technique to  handle the exception? no then go to the method from where it is called
//    }
//}