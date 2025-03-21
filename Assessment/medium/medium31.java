import java.util.Scanner;
class medium31{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first number");
	int n1 = scan.nextInt();
	System.out.println("Enter the second number");
	int n2 = scan.nextInt();
	System.out.println("Enter the third number");
	int n3 = scan.nextInt();
		if(n1<n2 && n2<n3 && n1<n3)
		{
		System.out.println("Incresing order");
		}
		else if(n1>n2 && n2>n3 && n1>n3)
		{
		System.out.println("Decresing order");
		}
		else
		{
		System.out.println("Neither increasing or decreasing order");
		}
}
}
		
