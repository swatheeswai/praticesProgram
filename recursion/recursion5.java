// Recursive Sum from 1 to N
class recursion5{
public static int m1(int n){
   if(n==0){
     return n;
    }
   else{
     return n+m1(n-1);
     }
     }
 public static void main(String args[]){
     int n =5;
     System.out.println("Sum from 1 to N:"+m1(n));
     }
  }   
