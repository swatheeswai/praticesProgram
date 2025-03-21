class NestedTry1{
   public static void main(String args[]){
      try{
         System.out.println("Stmt-1");
         System.out.println("stmt-2");
         System.out.println("Stmt-3");
      try{
           System.out.println("Stmt-4");
           System.out.println(10/0);
           System.out.println("Stmt-6");
         }
         catch(ArithmeticException  n){
             System.out.println("Stmt-7");
             }
          finally{
              System.out.println("Stmt-8");
              }
         System.out.println("Stmt-9");
           }
       catch(NullPointerException a){
            System.out.println("Stmt-10");
            }
          finally{
          System.out.println("Stmt-11");
          }
          System.out.println("Stmt-12");
    }
 }
