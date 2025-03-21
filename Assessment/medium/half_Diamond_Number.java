import java.util.Scanner;
class half_Diamond_Number{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number");
	int n = scan.nextInt();
	
		for(int i=1; i<n; i++)
		{
		  for(int j=i-1; j>=1; j--)
		  {
		    System.out.print(j);
		   
		  }
		  for(int k=2; k<i; k++)
		  {
		    System.out.print(k);
		  }
		  System.out.println();
		}
		
		for(int i=n; i>1; i--)
		{
		  for(int j=i-1; j>=1; j--)
		  {
		    System.out.print(j);
		   
		  }
		  for(int k=2; k<i; k++)
		  {
		    System.out.print(k);
		  }
		  System.out.println();
		}
		
	}
	}
		

