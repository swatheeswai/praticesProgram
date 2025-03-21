interface I{
   void swim();
   }
 class A {
    void eat(){
       System.out.println("eating");
       }
       }
 class B extends A implements I
 {
 public void swim(){
    System.out.println("swiming");
    }
    }
public class interface_example{
public static void main(String args[]){
    B a = new B();
    a.swim();
    a.eat();
    }
    }
