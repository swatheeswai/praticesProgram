//String to Interger conversion {
  class Test1{
  public static void main(String args[]){
      String s ="123";
      int a = Integer.parseInt(s);
      System.out.println(a);
      //concatenation operation
      String s1= "123";
      int a1 = Integer.parseInt(s1);
      System.out.println(s1+100);
      System.out.println(a1+100);
      //valueOf()
      String s2="100";
      int a2 = Integer.valueOf(s2);
      System.out.println(a2);
      //Number formate exceptioncase
      String s3 = "hello";
      int a3 = Integer.valueOf(s3);
      System.out.println(a3);
      }
      }
 

