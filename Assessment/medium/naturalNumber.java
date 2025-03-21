import java.util.Scanner;
class naturalNumber{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the Natural number");
int n = scan.nextInt();
	System .out.println("The first"+n+"Natural numbers");
	for(int i=1;i<=n;i++)
	{
	System .out.println(i);
	}
}
}
