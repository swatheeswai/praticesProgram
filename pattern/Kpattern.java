import java.util.Scanner;
class Kpattern{
   public static void main(String args[]){
       System.out.println("Enter the row:");
       Scanner scan = new Scanner(System.in);
       int row = scan.nextInt();
       
       for(int i=0;i<=row;i++){
           for(int j=i;j<row;j++){
              System.out.print("*");
              }
              System.out.println();
              }
                 for(int i=row;i>=2;i--){
           for(int j=i;j<=row;j++){
              System.out.print("*");
              }
              System.out.println();
              }
         }
     }
