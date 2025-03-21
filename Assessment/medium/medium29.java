import java.util.Scanner;
class medium29{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Integer number less than ten billion: ");
	long n = scan.nextLong();
	int count=0;
		if(n<0 || n>=1000000000)
		{
			System.out.println("Invalid input");
		}
		while(n!=0)
		{
			n/=10;
			count++;
		}
	System.out.println("Number of digits in the number: " + count);
}
}
