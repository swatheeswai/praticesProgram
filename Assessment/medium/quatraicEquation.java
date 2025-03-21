import java.util.Scanner;
class quatraicEquation{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the a value:");
int a =scan.nextInt();
System.out.println("Enter the b value:");
int b = scan.nextInt();
System.out.println("Enter the c value:");
int c = scan.nextInt();
double d = b*b-4*a*c;

if(d>0){
 double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
 if(d==0){
    double root = -b / (2 * a);
            System.out.println("The root is " + root);
        }
  else{
  System.out.println("the equation has imaginery");
  }
  }
  }
  }

