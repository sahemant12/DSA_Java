////creating exception by the help of try-catch & (throw & throws)
////user define exception
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
//            System.out.println(e);
//        }
//    }
//     public static void vote(int age) throws InvalidAgeException{
//
//         if(age<18){
//             throw new InvalidAgeException("Not eligible for voting"); //we create our own exception object
//         }else{
//             System.out.println("Eligible for voting");
//         }
//     }
//}
//
//
//
//

//Exception Propagation
//class propagation{
//    public static void main(String[] args) {
//        try{
//            m1(); //is main method has the technique to handle the exception? no then it will go to the JVM to handle the exception
//        }
//        catch(ArithmeticException e){
//            System.out.println("main method handle the exception");
//        }
//    }
//
//   static void m1() {
////        try{
//            m2(); //is m1() method has the technique to handle the exception? no then go to the method from where it is called
////        }
////          catch(ArithmeticException e){
////              System.out.println("m1 method handle the exception");
////          }
//    }
//
//    static void m2() {
//        System.out.println(10/0);  //is m2() method has the technique to  handle the exception? no then go to the method from where it is called
//    }
//}
