import java.util.Scanner;
class medium28{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("enter the size");
double n =scan.nextDouble();
	if(n==0)
	{
	System.out.println("Zero");
	}
	else 
     {
	if(n>0)
	{
	System.out.println("positive");
	}
	else
	{
	System.out.println("Negative");
	}
	
	 double absvalue = ((n<0)?-n:n);
	 if(absvalue<1)
	 {
	 System.out.println("small");
	 }
	 else if(absvalue>100000);
	 {
	 System.out.println("large");
	 }
    }
}
}
	 

