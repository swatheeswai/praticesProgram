class A{
    void show(){
    System.out.println("showing");
    }
   class B{
     void disp(){
       show();
       }
  }
    }
 class class_access{
 public static void main(String args[]){
     A a = new A();
     A.B b = a.new B();
     b.disp();}
     }
