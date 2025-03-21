import java.util.Scanner;
class Average{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the  number");
int n = scan.nextInt();
int sum=0;

	for(int i=1; i<=n; i++)
	{
	sum+=i;
	System.out.println(i);
	}
	System.out.println("Sum of values:"+sum);
	double average = sum/n;
	System.out.println("The Average value is:"+average);
	}
	}
	

