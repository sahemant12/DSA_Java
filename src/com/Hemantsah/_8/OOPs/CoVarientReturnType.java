//class x{
//    x show(){ //type class
//        System.out.println("Hello i am learning OOPS");
//        return this; //this is a keyword in java which refers to current object
//    }
//}
//class y extends x{
//    @Override
//    y show(){  //type class
//        super.show(); //super is a keyword in java by which we can access parent class variable + method + constructor
//        System.out.println("Hello i am learing co-varient");
//        return this; //this is a keyword in java which refers to current object
//    }
//}
//class print{
//    public static void main(String[] args) {
//        y obj=new y();
//        obj.show();
//    }
//}


////var-argument
//class varArg{
//    void mul(int ... a){
//        int mul=1;
//       // mul*=a; //we can't multiply any number with array
//       for(int i:a){ //same as for(int i=0; i<a.length; i++)
//           mul*=i;
//       }
//        System.out.println(mul);
//    }
//}
//class print{
//    public static void main(String[] args) {
//        varArg var=new varArg();
//        var.mul();   var.mul(1); var.mul(1,2); var.mul(1,2,3); var.mul(1,2,3,4);
//    }
//}
