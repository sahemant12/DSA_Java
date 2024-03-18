
class Outerclass{  //class under class is possible and inner class may be, may not be static but outer class will not be static becoz it itself not dependent on other class

   static class inner{   //After making this class as static it will not dependentent on outerclass, object of outerclass is not required to run this class
       //and its internal variable, method may dependent on object
      static String name;

       inner(String name) {
            inner.name = name;
        }

    }

    public static void main(String[] args) {
        inner in=new inner("Kunal"); //it is showing error becoz it call the constructor of inner class which is dependentent on other class to avoid error we have to make inner class as static.
        // If we put innerclass outside the outerclass then it will not show error

        inner in2=new inner("Ishan"); //if we make name variable as static then in both print statement it will print ishan because it does not depent on object

        System.out.println(in.name);
        System.out.println(in2.name);
    }

}

