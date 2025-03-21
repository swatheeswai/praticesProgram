import java.util.Scanner;
class sandclock{
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        for(int i=row; i>=1;i--){
           for(int j=row; j>i; j--){
               System.out.print(" ");
               }
           for(int j=1;j<=(2*i-1);j++){
               System.out.print("*");
               }
           System.out.println();
           }
            for(int i=1; i<=row;i++){
           for(int j=i; j<row; j++){
               System.out.print(" ");
               }
           for(int j=1;j<=(2*i-1);j++){
               System.out.print("*");
               }
           System.out.println();
           }
           }
           }
