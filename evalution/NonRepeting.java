class NonRepeting{
   public static void main(String args[]){
       String s = "siisst";
     
       for(int i=0;i<s.length();i++){
          char ch = s.charAt(i);
          boolean flag = false; 
         for(int j=0;j<s.length();j++){
             char cha = s.charAt(j);
          if(i!=j && ch==cha ){
             flag = true;
             break;
             }
         }
         
          if(!flag){
           System.out.println(ch);
           break;
             }
             }
          }   
    }
    
    
   
