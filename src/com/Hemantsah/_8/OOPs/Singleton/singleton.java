package com.Hemantsah._8.OOPs.Singleton;

//sometimes we want only on instance of a class should be created. At that time we use singleton class.
public class singleton { //does not allow us to create constructor, since no constructor is allowed to create hence no object will created
    private singleton() {  //since this constructor is private so that we can't create object of it outside the class
                //rest code later if required
    }

    public static void main(String[] args) {
        singleton ob=new singleton();
    }
}
