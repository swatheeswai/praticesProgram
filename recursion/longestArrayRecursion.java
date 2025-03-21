class longestArrayRecursion{
  public static int m1(int arr[],int index){
      if(index == arr.length-1){
             return arr[index];
             }
      int max = m1(arr,index+1);
      if(arr[index]>max){
         return arr[index];
         }
       else{
          return max;
          }
       }
 public static void main(String args[]){
     int arr[]={1,2,3,55,33,99,52};
     System.out.println(m1(arr,0));
     }
     }

       
