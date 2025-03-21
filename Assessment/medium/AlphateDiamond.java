import java.util.Scanner;
class AlphateDiamond{
public static void main(String args[]){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the input:");
     int n = scan.nextInt();
     char ch;
     	for(int i=0; i <n; i++)
     	{
     	 ch = 'A';
     	  for(int j=0; j<i; j++)
     	  {
     	    System.out.print(ch);
     	    ch++;
     	  }
     	  for(int k=1; k<i; k++){
     	  System.out.print(ch);
     	  ch--;
     	  }
     	    System.out.println();
     	}
     	
     	
         for(int i=n; i >0; i--)
     	{
     	 ch = 'A';
     	  for(int j=0; j<i; j++)
     	  {
     	    System.out.print(ch);
     	    ch++;
     	  }
     	  for(int k=1; k<i; k++){
     	  System.out.print(ch);
     	  ch--;
     	  }
     	    System.out.println();
     	}
    }
    }
