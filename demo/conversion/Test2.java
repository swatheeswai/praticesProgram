//conversion of int to string 
class Test2{
 public static void main(String args[]){
    int a=100;
    String s = String.valueOf(a);
    System.out.println("Value of method"+s);
 //toString()
     int a1 = 200;
     String s1 = Integer.toString(a1);
     System.out.println("toString() add a string:"+s1+100);
     System.out.println(a1+100);
 //format()
 int a2=300;
 String s2= String.format("%d",a2);
 System.out.println("format()"+a2);
 }
 }
 
     
