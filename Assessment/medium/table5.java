import java.util.Scanner;
class table5{
public static void main(String []args){
Scanner scan = new Scanner(System.in);
System.out.println("enter the number");
int sum =0;

	int n = scan.nextInt();
	for(int i =1; i < n; i++)
	{
	  sum =n*i;
	  System.out.println(n + "*" + i+ "=" + sum);
	  }
}
}

