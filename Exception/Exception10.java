public class Exception10 {
public static void main(String[] args) 
{	
    for(int i = 1; i <= 5; i++)	
    System.out.println("Value of i: " +i);
    
    Thread.sleep(1000);
    System.out.println("Hello Java");
  }
}
/* checked exception
  Exception10.java:7: error: unreported exception InterruptedException; must be caught or declared to be thrown
    Thread.sleep(1000);
                ^
1 error
*/
