import java.util.Scanner;
class cube{
public static void main(String args[]){
	Scanner scan = new  Scanner(System.in);
	System.out.println("Enter the number");
	int n = scan.nextInt();
	int cube=0;
	for(int i=1;i<=n;i++)
	{
	   cube=i*i*i;
	System.out.println("Number is : " + i + " and cube of " + i + " is : " + cube);
	}
}
}
