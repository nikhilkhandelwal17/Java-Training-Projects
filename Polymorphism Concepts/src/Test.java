// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class A{
    
    public void show(){
        System.out.println("I am from class a");
    }
    public void  teach(){
        System.out.println("I am Teach from Class A");
    }
}
 class B extends A{
	 public void show(){
        System.out.println("I am from class b");
    }
	 public void  teach(){
        System.out.println("I am Teach from Class b");
    }
	 public void Bty(){
        System.out.println("B function class");
    }
 }
 
 class C extends B{
	 public void  teach(){
        System.out.println("I am Teach from Class c");
    }
    public void Bty(){
        System.out.println("c function class");
    }
 }
   public class Test{
    public static void main(String[] args) {
     B a1=new C();
       a1.show();
       a1.teach();
       a1.Bty();
    }
}
 