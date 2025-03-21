import java.util.Scanner;
class oddAverage{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number");
int n =scan.nextInt();
int sum =0;

	for(int i =1; i<=n; i++)
	{
	 	if(i%2!=0)
	 	{
	 	 System.out.println(i);
	 	sum+= i;
	 	}
	 	}
	 	System.out.println("Sum of Odd Numbers up to " + n + ": " + sum);
	 
	 }
	 }
	    

