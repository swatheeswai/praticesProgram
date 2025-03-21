class Parent{
   static void m1(){
      System.out.println("parent class static method");
      }
   }
class Child extends Parent{
     static void m1(){
        System.out.println("Child class static method");
        }
        }
 class MethodHiding{
    public static void main(String args[]){
       Parent c = new Child();//parent type but creating a child object
       Parent p = new Parent();//parent type but creating child object
       c.m1();    //
       p.m1();
       }
       }
