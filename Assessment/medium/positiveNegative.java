import java.util.Scanner;
class positiveNegative{
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int num =scan.nextInt();
		if(num<0)	
		{
			System.out.println("negative");
		}
		if(num>0)
		{
			System.out.println("positive");
		}
}
}

