//object based programming vs object oriented programming
//Singleton class
class Animal{
Animal(){}
 void add(float a,float b){
System.out.println(a+b);
}
void add(int a,int b){
System.out.println(a+b);
}

 string name;
    void action(){
   System.out.println("Animal");
   }
   }
   
 class dog extends Animal{
    void dog(){
    System.out.println("dog");
    }
    }
  class cat extends Animal{
  void cat(){
  System.out.println("cat");
  }
  }
  class babycat extends cat{
    void babycat(){
    System.out.println("babycat");
    }
    public String tostring(){
      return name;
      }
        
    class Inheritance{
    public static void main(String args[]){
        cat c = new cat();
        c.action();
        c.dog();
        c.cat();
        babycat b = new babycat();
        b.babycat();
        Animal a = new Animal();
       System.out.println( a.name);
       a.add(1.0f,2.0f);
          System.out.println(a.toString());
        }
        }
        
   abstract class Main{
     abstract void add();
     abstract void sub();
     }
     class main1 extends Main{
        @Override
        void add(){
        System.out.println(10+20);
        }
        }
     class main2 extends main1{
     
     } 
     interface Main{
       int a;
       void add();
       }
           
   
   
   
   
   
    
