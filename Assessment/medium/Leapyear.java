import java.util.Scanner;
class Leapyear{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the year");
	int num = scan.nextInt();
		if(num%4==0 && num%100!=0 || num%4==0)
		{
		System.out.println(num+" "+"is a Leap Year");
		}
		else{
		 System.out.println(num+" "+"is a not Leap Year");
		 }
}
}
