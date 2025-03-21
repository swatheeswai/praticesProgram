class nestedTry{
 public static void main(String args[]){
      System.out.println("Db connection starts");
           try{
            try{
                System.out.println(10/0);
                }
                 catch(ArithmeticException e){
                                 System.out.println("catch1:"+e.getMessage());
                                 }
                                finally{
                                    System.out.println("1rd finally block");
                                    }
                try{
                       int a[] =new int[5];
                     a[10]=4;
                     }
                      catch(ArrayIndexOutOfBoundsException a){
                                 System.out.println("Catch2:"+a.getMessage());
                               }
                               
                            finally{
                                 System.out.println("2d try block");
                                 }
                     
                    try{
                         String s =null;
                         int length= s.length();
                         System.out.println(length);
                         }
                         catch(NullPointerException n){
                             System.out.println("Catch3:"+n.getMessage());
                             }
                           finally{
                                System.out.println("3rd try block");
                                }
                            }
                            catch(Exception e){
                                  System.out.println(e.toString());
                                  }
                                  finally{
                                       System.out.println("Outer finallyblock");
                                    }
                                    System.out.println("db Connection terminated");
                  }
             }
                                    
                                    
                           
                   
                     
