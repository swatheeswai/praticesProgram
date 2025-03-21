//String methods
class stringMethods{
   public static void main(String args[]){
        //charAt()
    String str = "java programing is easy to learn";
    String str1 ="Python is a easier to java";
     char ch =  str.charAt(3);
    int result1 = str.codePointAt(0);
    int result2 = str.codePointBefore(7);
    int result3 = str.codePointCount(0,8);
    int result4 = str.compareTo(str1);
    int result5 = str.compareToIgnoreCase(str1);
    String result6 = str.concat(str1);
    boolean result7 = str.contains("easy");
    boolean result8 = str.contentEquals("to");
    
    System.out.println("CharAt Method:"+ch+"\ncodepointat methos:"+result1+"\ncodePointBefore Method:"+result2+"\ncodePointCount:"+result3+"\ncompareTo:"+result4+"\ncompareTOIgnorecase"+result5+"\nconcat"+result6+"\ncontains"+result7+"\ncontentEqual"+result8+" ");
    
      }
      }
