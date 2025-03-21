import java.util.Scanner;
class countingDigit{
public static int countNumber(int n){
  System.out.println("-----------Counting----------------");  
     int count=0;
     while(n>0){
        int lastdigit=n%10;
           count++;
        n=n/10;
        }
        return count;
        }
public static int reverseNumber(int n){
        System.out.println("-----------ReverseNumber----------------");  
      int rev =0;
       while(n>0){
        int lastdigit=n%10;
        rev = (rev*10)+lastdigit;
        n=n/10;
        }
        return rev;
        }
  public static boolean palindrom(int n){
         System.out.println("-----------Palindrom----------------");  
        int rev =0;
        int dup = n;
       while(n>0){
        int lastdigit=n%10;
        rev = (rev*10)+lastdigit;
        n=n/10;
        }
        if(rev==dup){
           return true;
        }
        else{
           return false;
           }
           }
  public static boolean Amstrong(int n){
        System.out.println("-----------Amstrong----------------");  
         int sum = 0;
         int dup=n;
         while(n>0){
         int lastdigit=n%10;
         sum = sum+(lastdigit*lastdigit*lastdigit);
         n = n/10;
         System.out.println(sum);
         }
         if(sum==dup){
            return true;
            }
          else{
             return false;
             }
           }
  public static void printAllDigit(int n){
       System.out.println("-----------Print All Divisible Digits----------------");
        int i=1;
        while(i<n){
            if(n%i==0){
                System.out.println(i);
                }
           i++;
                }
               } 
  public static boolean prime(int n){
       System.out.println("----------Check prime or Not----------------");
        int count =0;
        for(int i=1;i<=n;i++){
             if(n%i==0){
                 count=count+1;
                 }
                 }
       if(count==2){
         return true;
             }
        else{
          return false;
             }
         }
   public static int gcd(int n1,int n2){
         System.out.println("-----------GCD----------------");
         int gcd=0;
         if(n1>n2){
             for(int i =1; i<n1; i++){
                  if(n1%i==0 && n2%i==0){
                     gcd = i;
                     
                     }
                   }
                   }
          else{
                System.out.println("your first number is bigger");
                }
                     return gcd;
                     }
       
         
   
   public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      //System.out.println(countNumber(n));
      //System.out.println(reverseNumber(n));
      //System.out.println(palindrom(n));
      //System.out.println(Amstrong(n));
      //printAllDigit(n);
     System.out.println(prime(n));
     System.out.println(gcd(9,12));
       }
       }
       
