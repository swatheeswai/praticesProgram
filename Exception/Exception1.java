/*1. Write a Java program that throws an exception and catch it using a try-catch block.*/
import java.util.Scanner;

class Exception1{
        
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
             System.out.println("Enter the first Number:");
             int a = scan.nextInt();
             System.out.println("Enter the Second Number:");
             int b = scan.nextInt();
             System.out.println("Enter your sign (+,-,*,/)");
             String sign = scan.next();
          try{
            
             switch(sign){
              case "+":
                   System.out.println("your answer:"+(a+b));
                   break;
              case "-":
                   if(a>=b){
                   System.out.println("your answer:"+(a-b));
                   }
                   else{
                      System.out.println("Must be! your first value is greater than second value");
                      }
                   break;
              case "*":
                   System.out.println("your answer:"+(a*b));
                   break;
              case "/":
                   System.out.println("your answer:"+(a/b));
                   break;
              default:
                   System.out.println("your sign not match in given data\nplease Enter valid sign");
                   }
              }
         
         catch(ArithmeticException e){
             System.out.println("Sorry you not doing this kind of operation..."+e.getMessage());
             }
          finally{
              scan.close();
             }
        }
 }

