import java.util.Scanner;

public class medium32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first floating-point number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter the second floating-point number: ");
        double num2 = scan.nextDouble();
          num1 = num1*100;
          num2 = num2*100;
         
         int decimalpoint1 = (int)num1;
         int decimalpoint2 = (int)num2;
        
         if(decimalpoint1==decimalpoint2)
         {
         System.out.println("Two decimal point are same");
         }
         else
         {
           System.out.println("Two decimal point are not same");
         }
  }
  }
  
           
      
