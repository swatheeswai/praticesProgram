import java.util.Scanner;
class Calculator{
 void add(int a, int b)
 {
 	System.out.println("Addition"+" "+(a+b));
 }
  void sub(int a, int b)
 {
 	System.out.println("Subraction"+" "+(a-b));
 }
  void mul(int a, int b)
 {
 	System.out.println("Multiplication"+" "+(a*b));
 }
  void div(int a, int b)
 {
 	System.out.println("Division"+" "+(a/b));
 }
  void mod(int a, int b)
 {
 	System.out.println("Modulus"+" "+(a%b));
 }
  void add(int a, int b, int c)
 {
 	System.out.println("Three"+" "+(a+b));
 }
  void sub(int a, int b, int c)
 {
 	System.out.println("three"+" "+(a-b-c));
 }
 
}

public class Main{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the First Number");
	int a =scan.nextInt();
	
	System.out.println("Enter the Second Number");
	int b =scan.nextInt();
	
	System.out.println("Enter the third Number");
	int c =scan.nextInt();
	
Calculator calc = new Calculator();
calc.add( a ,  b);
calc.sub( a ,  b);
calc.mul( a ,  b);
calc.div( a ,  b);
calc.mod( a ,  b);
calc.add1( a ,  b, c);
calc.sub1( a ,  b, c);

 
}
}
