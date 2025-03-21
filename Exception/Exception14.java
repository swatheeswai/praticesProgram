public class Exception14{
public static void main(String[] args)
{
    try {
      for (int i = 1; i <= 5; i++) 
      {
         System.out.print(i + " ");
      }
    }
    catch (Exception e) {
        System.out.println(e.getMessage());	
    }
    System.out.println("\nOut of try-catch block");
  }
}

