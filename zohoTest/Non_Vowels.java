/*Write a program that will take one string as input. The program will then remove vowels a, e, i, o, and u (in lower or upper case ) from the string. 
If there are two or more vowels that occur together then the program shall ignore all of those vowels.
Example 1
Input:  Cat
Output:  Ct
Example 2
Input:  Compuuter
Output: Cmpuutr*/
import java.util.Scanner;
class Non_Vowels{
     public static String removeVowels(String s){
     String vowels = "aeiouAEIOU";
     StringBuilder result = new StringBuilder();
     boolean flag =false;
     for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
      if(vowels.indexOf(ch)!=-1){
          if(!flag){
          flag = true;
          result.append(ch);
          }
          }
         else{
           flag =false;
           result.append(ch);
        }
      }
      return result.toString();
   }   
   public static void main(String args[]){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the String");
     String s = scan.nextLine();
     System.out.println("Result:"+removeVowels(s));
      }
      }
      

