import java.util.Scanner;
class secondLargest{
public static void main(String args[]){
	
  	Scanner scan = new Scanner(System.in);
	System.out.println("enter the size of array:");
		int size =scan.nextInt(); 

		int []a=new int [size];
			System.out.println("Enter the element:");
				for(int k=0;k<size;k++)
			{ 
				a[k]=scan.nextInt();
			}
			
				int temp=0;
				for(int i=0;i<size;i++)
			{
				
				for(int j=i+1;j<size;j++){
					if(a[i]<a[j])
			{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
			}
				
			}
			System.out.println("the second largest number in the array is:"+ a[1]);
}
}

