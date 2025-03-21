/*class A{
     String name = "raja";
     int age = 22;
     
     void behaviour(){
        System.out.println("always sleeping");
        }
        }
        
class B extends A{
}
class singleInheritance{
public static void main(String[] args){
B b = new B();
System.out.println(b.name);
System.out.println(b.age);
b.behaviour();}
}*/


class dog1{
  String color="black";
  int age= 5;
  void bark(){
  System.out.println("this dog is always barking");
  }
  }
  
class dog2 extends dog1{
   void eat(){
   System.out.println("this dog is always eating behaivour");
   }
   }
   
   class singleInheritance{
   public static void main(String[] args){
   dog1 d1 = new dog1();
   d1.bark();
   System.out.println(d1.color);
   System.out.println(d1.age);
   
   dog2 d2 = new dog2();
   d2.eat();
     System.out.println(d1.color);
   System.out.println(d1.age);
   }
   }
   
