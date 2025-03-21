import java.util.Scanner;
class valueOfN{
public static void main(String args[]){
	Scanner scan =new Scanner(System.in);
	System.out.println("Input the number");
	double m = scan.nextInt();
	int n;
		if(m>0)
		{
		 n=1;
		}
		else if(m==0)
		{
		n=0;
		}
		else
		{
		n=-1;
		}
		System.out.println("the m value:"+ m);
		System.out.println("the n value:"+n);
	}
	}
