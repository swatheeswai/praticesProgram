//2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd
import java.util.Scanner;
class Check{
   public void check(int a){
          if(a==1){
              System.out.println(a+"number is not even and odd is a consonat");
              }
       else if(a%2==0){
            System.out.println("The given number is even:"+ a);
           }
        else{
            throw new IllegalArgumentException(a + " is odd.");
            }
         
     }
}   
public class Exception2{
  public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number");
      int a = scan.nextInt();
     
     
     Check ch = new Check();
      try{
     ch.check(a);
      }
      catch(IllegalArgumentException e){
           System.err.println("Error:"+e.getMessage());
           }
     }
  }
    
