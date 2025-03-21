//binarySearch using recursion
class BinarySearchRecursion{
     public static int search(int a[],int target,int start,int end){
      if(start > end){
          return -1;
          }
      int mid = (start+end)/2;
      if(a[mid] == target){
          return mid;
          }
      if(a[mid] > target){
          return search(a,target,start,mid-1);
          }
       
           return search(a,target,mid+1,end);
        
  }
 public static void main(String args[]){
      int a[]={1,2,3,4,566,78,99,700};
      int target = 332;
      int start=0;
      int end = a.length-1;
      System.out.println("Target Value:"+search(a,target,start,end));
      }
    }  
