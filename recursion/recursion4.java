class recursion4{
    public static int m1(int n){
     //if(n<2) this is one approach in recursion
      // this is one apporach
       if(n==0){
          return 0;
          }
       else if(n==1){
           return 1;
      }
      return m1(n-1)+m1(n-2);
      
   }
 public static void main(String args[]){
     int n =50;
     System.out.println(m1(n));
     }
     }
    
