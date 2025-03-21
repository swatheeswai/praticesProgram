//10. Write a Java program to find the maximum and minimum value of an array.
class MinMaxArray{
   public static void m1(int arr[]){
   int max =arr[0];
   int min = arr[0];
          for(int i=1;i<arr.length;i++){
               if(max<arr[i]){
                  max=arr[i];
                  }
               if(min>arr[i]){
                   min=arr[i];
                   }
             }
          System.out.println(max);
          System.out.println(min);
          }
 
    public static void main(String args[]){
        int arr[] ={33,4,2,3,6,22,88,1,0,39,67};
        m1(arr);
        reverse(arr);
        }
        }
