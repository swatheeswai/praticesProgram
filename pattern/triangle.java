//triangle pattern
import java.util.Scanner;
class triangle{
   public static void main(String args[]){
       System.out.println("Enter the row:");
       Scanner scan = new Scanner(System.in);
       int row = scan.nextInt();
       for(int i=1;i<=row;i++){
          for(int j=i;j<row;j++){
              System.out.print(" ");
              }
           for(int j=1;j<=(2*i-1);j++){
               System.out.print("*");
               }
            System.out.println();
            }
          }
          }
           
          
