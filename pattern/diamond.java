//diamond pattern programming
import java.util.Scanner;
class diamond{
    public static void main(String args[]){
        System.out.println("Enter the row of pattern:");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        for(int i = 1; i <=row; i++){
            for(int j = i; j <row; j++){
                System.out.print(" ");
                }
                
            for(int k =1;k <=(2*i-1); k++){
                  System.out.print("*");
                  }
             System.out.println();
             }
                for(int i = row; i >=0; i--){
            for(int j = row; j >i; j--){
                System.out.print(" ");
                }
                
            for(int k =1;k <=(2*i-1); k++){
                  System.out.print("*");
                  }
             System.out.println();
             }
             }
             }
        
