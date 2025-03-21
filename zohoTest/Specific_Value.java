//5. Write a Java program to test if an array contains a specific value
import java.util.Scanner;
class Specific_value{
   public static void main(String args[]){
   Scanner scan =new Scanner(System.in);
  
   System.out.println("Enter the size of the Array");
    int size =scan.nextInt();
  System.out.println("Enter the element of Array");
     int arr[] = new int[size];
     for(int i=0;i<size;i++){
     System.out.print("Element " + (i + 1) + ": ");
         arr[i] = scan.nextInt(); 
     }
   System.out.println("Enter your specific Element");
         int specific = scan.nextInt();
     boolean found = false;
   for(int i =0;i<arr.length;i++){
        if(arr[i]==specific){
             found = true;
            System.out.println("your found element is:"+i);
            }
         
    }
    if(!found){
           System.out.println("not found");
            }
    }
    }
          
