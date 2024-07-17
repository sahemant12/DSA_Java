//object class : topmost class in inheritance. Every class automatically extends ObjectClass


package com.Hemantsah._8.OOPs.KKLecCoding;

public class OOP4_ObjectClass {

    public OOP4_ObjectClass() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        OOP4_ObjectClass obj=new OOP4_ObjectClass();

        System.out.println(obj.hashCode());

    }
}
