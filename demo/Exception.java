//throw keyword usinga unchecked exception
class Test{
 void validation(int a){
 if(a<18){
   throw new ArithmeticException("you are not eligible to vote");
   }
   else{
       System.out.println(" you are eligible to vote");
       }
       }
       }
       
class Exception{
public static void main(String args[]){
     Test t = new Test();
     t.validation(23);
     }
     }
  
