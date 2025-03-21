import java.util.Scanner;
class program19{
public static void main(String args[]){
        int i;
        Scanner scan = new Scanner (System.in);
	System.out.print ("Enter the size of  numbers");
	int n = scan.nextInt();
		int a[]=new int [n+1];
			for( i=0 ; i < n ; i++)
				 a[i]=scan.nextInt();	 
       		
       		System.out.println ("Enter the element:");
       		int element = scan.nextInt();
       		
       		
       		System.out.println("At what Position?:");
       		int pos = scan.nextInt();
       		if(pos < n){
       		for( i = n ; i > pos ; i--)
       		a[i]=a[i-1];
       		a[i]=element;
       		System.out.println("New value is insert the array");
       		for(i = 0; i < n+1; i++){
       		System.out.print(a[i] + " ");    
       		}
       		}
       		else{
       		System.out.println("Invalid");
       		}      
        }
        }




