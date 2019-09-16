
package javaapplication3;

 abstract class demo{
   public abstract void a();
   public abstract void b();
   public abstract void c();
   public abstract void d();
   
}
 abstract class t extends demo{
    @Override
    public void a(){
        System.out.println("Hello world");
    }
}


abstract class JavaApplication3 extends t {
 @Override
 public void b(){
     System.out.println("Hello bangladesh");
 }
 
  @Override
 public void c(){
     System.out.println("Hello Noakhali");
 }
 
  @Override
 public void d(){
     System.out.println("Hello comilla");
 }
 
 
  
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication3 t = new JavaApplication3() {};
        t.a();
        t.b();
        t.c();
        t.d();
        
    }
    
}
