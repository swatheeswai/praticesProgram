import java.util.Scanner;
class program6{
public static void main(String args[]){
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the weightpounds:");
      double weightpounds=scan.nextInt();
  
  System.out.println("Enter the heightinch:");
      double heightinch=scan.nextInt();
  
      double BMI=(weightpounds/(heightinch*heightinch))*703;
  System.out.print("your BMI value is:"+ " "+BMI);
  
  }
  }
    
