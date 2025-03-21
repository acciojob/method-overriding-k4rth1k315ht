package com.driver;

public class Main {

    public class A{
        public String meth()
        {
            return "Invoking method from class A" ;

        }
    }


    public class B extends A {
        @Override
        public String meth()
        {
            return "Method is overridden in Extended class B";
        }
    }

   public static void main(String[] args)
   {
       Main m = new Main();

      B obj= m.new B();
      obj.meth();       // returning class A method string but after creating class b method it will return its method string

      obj.meth();











   }
  
}