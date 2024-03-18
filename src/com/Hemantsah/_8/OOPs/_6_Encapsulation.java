package com.Hemantsah._8.OOPs;
//Difference: Encapsulation vs Abstraction
//Encapsulation: Two parts- (i).Data Hiding (ii).Data Abstraction
class Encapsule{
    private int x; //data hiding
    public void setvalue(int x){ //data abstraction
        this.x=x;
    }
    public int getvalue(){
        return x;
    }
}
class encap{
    public static void main(String[] args) {
        Encapsule obj=new Encapsule();
     //   obj.x=20; can't do because x have private access
        obj.setvalue(20);
        System.out.println(obj.getvalue());
    }
}
