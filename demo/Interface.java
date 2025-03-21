interface Main{
  void say();
  void message();
  }
class interface1 implements Main{
   @Override
  public void say(){
   System.out.println("something say");
   }
   @Override
  public void message(){
   System.out.println("something say");
   }
  }
  class Interface{
  public static void main(String args[]){
     interface1 i =new interface1();
     i.say();
     i.message();
     }
     }
  
