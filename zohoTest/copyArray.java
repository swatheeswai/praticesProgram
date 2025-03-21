/* Write a Java program to copy an array by iterating the array.*/
import java.util.Arrays;
class copyArray{
   public static void main(String args[]){
         int arr1[]={12,34,56,78,89};
         int arr2[]=new int[arr1.length];
            System.out.println("Original Array:"+Arrays.toString(arr1));
                 for(int i=0 ;i<arr1.length;i++){
                     arr2[i] +=arr1[i];
              }
         System.out.println("Copy Array:"+Arrays.toString(arr2));
         }
         }
