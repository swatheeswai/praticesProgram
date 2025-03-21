
import java.util.Scanner;
 interface calculator{
      public abstract void add();
      void sub();
   }
   
 class mycal1 implements calculator{
     public void add(){
          int a =10;
          int b =20;
          int c=a+b;
          System.out.println("Add the mycal1:"+c);
          }
    public void sub(){
          int a =10;
          int b =20;
          int c=a-b;
          System.out.println("Sub the mycal1:"+c);
          }
  }
  
 class mycal2 implements calculator{
      public void add(){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the first number");
      int a =scan.nextInt();
      
      System.out.println("Enter the second number");
      int b =scan.nextInt();
     
     int c = a+b;
     System.out.println("Add the mycal2:"+c);
     }
     
     public void sub(){
       Scanner scan = new Scanner(System.in);
      System.out.println("Enter the first number");
      int a =scan.nextInt();
      
      System.out.println("Enter the second number");
      int b =scan.nextInt();
     
     int c = a-b;
     System.out.println("Sub the mycal2:"+c);
     }
  }
  
  
  class mycal3 implements calculator{
  public void add(){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the first number");
      int a =scan.nextInt();
      
      System.out.println("Enter the second number");
      int b =scan.nextInt();
     if(a<=b){
     int c = a+b;
     System.out.println("Add the mycal3:"+c);
     }
     else{
     System.out.println("INVALID INPUT");
      }
     }
     
      public void sub(){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the first number");
      int a =scan.nextInt();
      
      System.out.println("Enter the second number");
      int b =scan.nextInt();
     if(b<=a){
     int c = a-b;
     System.out.println("Sub the mycal3:"+c);
     }
     else{
     System.out.println("INVALID INPUT");
     }
  }
}

class casio{
public void permit(calculator ref){
      ref.add();
      ref.sub();
      }
}

public class MyCalculator{
public static void main(String args[]){
      mycal1 mc = new mycal1();
     
      
      mycal2 mcc = new mycal2();
      
       
      mycal3 mac =new mycal3(); 
     
      
      casio c =new casio();
        c.permit(mc);
        c.permit(mcc);
        c.permit(mac);
        
      }
      }
      
 
     
     
     
      
