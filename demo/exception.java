import java.util.Scanner;
import java.util.InputMismatchException;
class exception{
public static void main(String args[]){
    System.out.println("Connection Start");
    try{
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the number");
    int a = scan.nextInt();
    System.out.println("enter the Second number");
    int b = scan.nextInt();
    int c = a/b;
    System.out.println(c);
    String s = null;
    System.out.println(s);
   
    }
     catch(ArithmeticException a){
     System.out.println(a);
     }
    catch(InputMismatchException i){
     System.out.println(i);
     }
      catch(NullPointerException n){
     System.out.println(n);
     }
      //catch(InputmismatchException i){
     //System.out.println(i);
     //}
     
     System.out.println("Connection end");
   }
   }
