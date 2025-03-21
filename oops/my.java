interface Myinterface{
  default void method(){
       System.out.println("default method");
       }
   static void method1(){
       System.out.println("static method");
       }
       }
   public class my{
     public static void main(String args[]){
        Myinterface i = new Myinterface(){};
         i.method();
        Myinterface.method1();
        }
        }
        
    // private method    
        
interface myinterface{
    private static void privateMethod(){
    System.out.println("privatevmethod");
    }
    static void method1(){
       privateMethod();
       }
       }
  public class my{
     public static void main(String args[]){
        myinterface.method1();
        }
        }
        
  
