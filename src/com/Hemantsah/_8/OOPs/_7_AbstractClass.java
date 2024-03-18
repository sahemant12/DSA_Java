package com.Hemantsah._8.OOPs;

//abstract class animal{
//    animal(){
//        System.out.println("All animals are making sound");
//    }
//    abstract void sound();
//}
//class lion extends animal{
//    lion(){
//        super();
//    }
//   public void sound(){
//        System.out.println("lion is roaring");
//}
//}
//class dog extends animal{
//    public void sound(){
//        System.out.println("dog is barking");
//    }
//}
//class test{
//    public static void main(String[] args) {
//        lion l=new lion();
//        l.sound();
//        System.out.println("Cheking1");
//        dog d=new dog(); //call the constructor of parent class
//        System.out.println("Cheking2");
//        d.sound();
//    }
//}



//abstract method

abstract class programming{
    public abstract void developer();
}
class html extends programming{
    @Override
  public void developer(){

      System.out.println("Developed by Tims Berner Lee");
    }
}
class java extends programming{
    @Override
    public void developer(){
        System.out.println("Developed by James Gosling");
    }
}
class showabs{
    public static void main(String[] args) {
//        java obj1=new java();
//        html obj2=new html();
//        obj1.developer();
//        obj2.developer();
        programming obj1=new java(); //we can't create object of abstract class but we can create reference variable of abstract class
        programming obj2=new html();
//        obj1.developer();
//        obj2.developer();
    }
}

abstract class program{
    public abstract void Developer();
    public abstract void Rank();
}
abstract class hero extends program{
    public void Developer(){
        System.out.println("Tim Berners Lee");
    }
//    public void Rank(){
//        System.out.println("Tim Berners Lee"); //since Rank() method is not override therefore we have to make this class as abstract class
//    }
}
class zero extends hero{
    public void Rank(){
        System.out.println("2nd");
    }
}
class fuck_You{
    public static void main(String[] args) {
        program obj3=new zero();
        obj3.Rank();
        obj3.Developer();
    }
}
