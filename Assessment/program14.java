import java.util.Scanner;
class program14{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size:");
	int size=scan.nextInt();
	int[] a =new int[size];
	System.out.println("Enter the Array number");
	    for(int i=0;i<a.length;i++)
		{
		a[i]=scan.nextInt();
		
		}
   	int sum=0;
        	for(int i=0;i<size;i++){
	  		 sum+=a[i];
		}
		float avg=(float)sum/size;
 	System.out.println("Average"+" "+avg);
 }
 }
