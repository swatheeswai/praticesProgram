class StringMethods{
public static void main(String args[]){
  //charAt()
  String s = "java";
  System.out.println("Index value"+s.charAt(3));
  System.out.println("------------------------------------------------");
  //Accessing First and Last Character by Using the charAt() Method
  String s1="javaPoint";
  //first index 
  char first_index = s1.charAt(0);
  System.out.println("first index value:"+first_index);
  //second index
   char second_index = s1.charAt(s1.length()-1);
  System.out.println("second index value:"+second_index);
   System.out.println("------------------------------------------------");
  
  // this program is oddposition in letters uniqucode values are prints
       String s3 ="javaprogramming";
       for(int i=0;i<s3.length()-1;i++){
       char ch = s3.charAt(i);
       if(ch%2!=0){
      //System.out.println("Char at "+i+" place "+ch);
      }
      }  
         System.out.println("------------------------------------------------");
      //Print Characters Presented at Odd Positions by Using the charAt() Method
      String s4 ="javaprogramming";
       for(int i=0;i<s4.length()-1;i++){
       if(i%2==1)
       System.out.println("Char at "+i+" place "+s4.charAt(i));
       }  
          System.out.println("------------------------------------------------");
           
  }
  }
