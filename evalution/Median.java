/*Array1: [0, 0]
Array2: [0, 0]

Combine: [0, 0, 0, 0]
Median: (0 + 0) / 2 = 0.0
*/
import java.util.Arrays;
class Median{
  public static void main (String args[]){
        int arr1[]={};
        int arr2[]=          {1};
        int arr3[]=new int[arr1.length+arr2.length];
       int index=0;
      for(int i=0; i<arr1.length;i++){
         arr3[index++] = arr1[i];
           }
       for(int j=0;j<arr2.length;j++){
           arr3[index++] = arr2[j];
           }
          Arrays.sort(arr3);
         System.out.println("Combine Array:"+Arrays.toString(arr3));  
         int n= arr3.length;
         double result;
          if(n%2==0){
           int mid1 = n/2-1;
           int mid2 = mid1-1;
            result = (arr3[mid1]+arr3[mid2]/2.0);
            }
          else{
             result = arr3[n/2];
             }
          System.out.println("Median:"+result);
          }
          }
             
           
        
         
