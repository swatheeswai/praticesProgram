/*1. Write a Java program to get the character at the given index within the string.

Sample Output:

Original String = Java Exercises!                                                                             
The character at position 0 is J                                                                              
The character at position 10 is i */
import java.util.Scanner;
class String1{
   public void display(String s,int pos){
       if(pos>=0 && pos<s.length()){
          char ch = s.charAt(pos);
          System.out.println("The character at position " + pos + " is " + ch);
        } else {
            System.out.println("Position " + pos + " is out of range.");
        }
        }
 public static void main(String args[]){
       String1 str = new String1();
       Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the String");
        String s = scan.nextLine();
       
        System.out.println("Enter the Position");
        int pos = scan.nextInt();
       
        str.display(s,pos);
        }
        }
