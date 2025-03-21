//butterfly pattern
import java.util.Scanner;
class butterfly{
   public static void main(String args[]){
       System.out.println("Enter the row:");
       Scanner scan = new Scanner(System.in);
       int row = scan.nextInt();
       for(int i=1;i<=row;i++){
         for(int j=1;j<=i;j++){
             System.out.print("*");
             }
         for(int j=1;j<=2*(row-i);j++){
              System.out.print(" ");
              }
            for(int j=1;j<=i;j++){
             System.out.print("*");
             }
         System.out.println();
         } 
         for(int i=row;i>0;i--){
         for(int j=1;j<=i;j++){
             System.out.print("*");
             }
         for(int j=1;j<=2*(row-i);j++){
              System.out.print(" ");
              }
            for(int j=1;j<=i;j++){
             System.out.print("*");
             }
         System.out.println();
         }
         }
         }

       
