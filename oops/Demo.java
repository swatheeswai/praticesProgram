

class P{
     public P()
     {
     System.out.print("Constructor");
     }
}
class C extends P{
     public C(int a)
     {
     System.out.println("noooo");
     }
  }
class D extends P{
      public D(char b)
      {
      System.out.println("yess");
      }
 }
public class Demo{
public static void main(String []args){

C c = new C('a');
//D d = new D('a');
}
}
