package com.driver;

public class Main {

    public static class A{
        public String meth()
        {
            return "Invoking method from class A" ;

        }
    }


    public static class B extends A {
        @Override
        public String meth()
        {
            return "Method is overridden in Extended class B";
        }
    }

   public static void main(String[] args)
   {


      B obj= new B();
      obj.meth();       // returning class A method string but after creating class b method it will return its method string

       obj.meth();
    // System.out.println( obj.meth());











   }
  
}