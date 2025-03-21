import java.util.Arrays;
class RotateArray{
   public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int n = arr.length;
        int result[] = new int[n];
        int k =3;
         for(int i=0;i<n;i++){
          
                  result[(i+k)%n]=arr[i];
                  
             }
          System.out.println(Arrays.toString(result));
          }
          }
          
               
             
