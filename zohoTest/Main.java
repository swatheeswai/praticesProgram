// instance of keyword using creating a reference check that class object to check
class A{
void s1(){
     System.out.println("A");
}
}
class B extends A{

}
class C extends B{

 }
class D extends C{
    
}
class Main{
  public static void main(String args[]){
       Object a = new A();
       A b = new B();
       B c = new C();
       C d = new D();
       
       //a.s1();
       System.out.println(b instanceof B);
       System.out.println(c instanceof C);
       System.out.println(d instanceof D);
       System.out.println(a instanceof A);
       }
       }
