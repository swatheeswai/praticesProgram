class OuterClass{
   int a =10;
 interface  demo {
     void sum();
     }

   class InnerClass implements demo{
       public void sum(){
         System.out.println(a+3);
         }
      }
  }
  class Outer_Inner{
    public static void main(String args[]){
        OuterClass out = new OuterClass();
        OuterClass.InnerClass inner = out.new InnerClass();
        inner.sum();
        }
        }
