interface types{
 void message();
  default void say(){
   System.out.println("default");
   }
  static void convey(){
     System.out.println("static");
     tell();
     }
  private static void tell(){
      System.out.println("private static");
      }
      }
 class interface1 implements types{
      public void message(){
         System.out.println("interface");
         }
         }
  class Interface2{
   public static void main(String args[]){
      interface1 i = new interface1();
      i.message();
      types.convey();
      i.say();
      }
      }
      
     
  
