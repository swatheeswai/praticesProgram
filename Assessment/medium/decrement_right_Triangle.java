import  java.util.Scanner;
class decrement_right_Triangle{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the input value");
	int  n =scan.nextInt();
		for(int i =n; i >=1; i--)
		{
		  for(int j = 1; j<=i; j++)
		  {
		  System.out.print("*");
		  }
		  System.out.println();
		}
}
}
