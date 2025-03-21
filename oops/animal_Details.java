//multi_level inheritance

class Animal{
   String name="tommy";
   int age = 3;
   }
 class dog extends Animal{
      void eat(){
      System.out.println("the dog is eat a heavy choclates");
      }
      }
 class disease extends dog{
       void disease(){
       System.out.println("the dog has seviour stomach pain");
       }
       }
 public class animal_Details{
  public static void main(String[] args){
  disease d = new disease();
     System.out.println("Name:"+d.name);
     System.out.println("Age:"+d.age);
     d.eat();
     d.disease();
     }
     }
     
