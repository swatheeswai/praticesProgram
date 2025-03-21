class recurion{
public static void main(String args[]){
   int a =1;
  naturalNumber(a);
   }
   static void naturalNumber(int a){
   if(a<=10){
 
     System.out.println(a);
     naturalNumber(a+1);
     }
     }
     }
     
