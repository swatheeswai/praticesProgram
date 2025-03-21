import java.util.Scanner;
class recursion3{
     public static int m1(int n){
     int fact=0;
       if(n==1){
         return 1;
         }
        else{
           return n*m1(n-1);
           }
       }
 public static void main(String args[]){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the factorial");
     int a = scan.nextInt();
     System.out.println("Result:"+m1(a));
     }
     }
