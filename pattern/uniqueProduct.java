//product the valur in equal the given target value
import java.util.Arrays;

class uniqueProduct{

public static void distinct(int arr[],int target){
       int i = 0;
       int j = arr.length-1;
       Arrays.sort(arr);
       boolean found = false;
    
      while(i<j){
         int product = arr[i]*arr[j];
         if(product==target){
             System.out.println("["+arr[i]+","+arr[j]+"]");
             found = true;
             i++;
             j--;
            }
         if(product < target){
                  i++;
         }
         else{
              j--;
              }
    }
    if(!found){
         System.out.println("no found give values");
         }
     }
    

      public static void main(String args[]){
           int arr[] = {2,4,1,6,8};
           int k = 8;
           distinct(arr,k);
        
            }
            }
       
      
       
       
