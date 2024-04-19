package com.driver;

public class Main {
    public static class A{

        int a=10;
        public String meth()
        {
            return "Invoking method from class A" ;
        }
    }
    public static class B extends A {

     //  int a=20;
        public String meth()
        {
            return "Method is overridden in Extended class B";
        }
    }

   public static void main(String[] args)
   {
      // A obj= new A();
      B bObj= new B();
       bObj.meth();



     // System.out.println(bObj.meth());
     // System.out.println(bObj.a);
      // System.out.println(obj.a);


   }
  
}