import java.util.Scanner;
class greatestNumber
{
  public static void main (String args[])
  {
	Scanner scan = new Scanner (System.in);
	  System.out.println ("enter a value:");
	int a = scan.nextInt ();
	  System.out.println ("Enter the b value");
	int b = scan.nextInt ();
	  System.out.println ("Enter the c value");
	int c = scan.nextInt ();
	if (a > b && b > c)
	  {
		System.out.println ("greater" + a);
	  }
	else if (b > a && b > c)
	  {
		System.out.println ("greater" + b);
	  }
	else
	  {
		System.out.println ("greater" + c);
	  }

  }
}

