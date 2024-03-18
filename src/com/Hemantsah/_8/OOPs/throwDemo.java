//class demo{
//    public static void main(String[] args) {
//        System.out.println(10/0); //exception created by java
//      throw new ArithmeticException("It is exception"); //exception created by us
//
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
//            throw new ArithmeticException(); //we don't want to handle this exception so that we can bypass it to the caller ie. JVM
//            // throw keyword is used to create exception object so that we can explicitly throw it to the JVM
//        }else{
//            int c=a/b;
//            System.out.println(c);
//        }
//    }
//    public static void main(String[] args) {
//        test te=new test();
//        try{
//            te.div(4,0);
//        }
//        catch(ArithmeticException e){
//            System.out.println("num is divisible by 0");
//        }
//
//    }
//}

