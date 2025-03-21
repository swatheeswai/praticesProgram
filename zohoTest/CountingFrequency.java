class CountingFrequency{
  public static void m1(int nums[],int n){
     boolean visited[]= new boolean[n];
     
     for(int i=0 ;i < n; i++){
          
       if(visited[i] == true){
          continue;
          }
          int count=1;
     for(int j=i+1;j<n;j++){
           if(nums[i] == nums[j]){
             visited[j] = true;
              count++;
              }
              }
  System.out.println(nums[i]+" "+"is"+" "+count+" "+"Repeated");
  }
  }
public static void main(String args[]){
     int nums[]={1,1,2,2,3,3,4,4,5};
     int n = nums.length;
     m1(nums,n);
     }
     }
