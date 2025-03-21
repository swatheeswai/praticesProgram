class StringPalindrome{
    public static void isPalindrome(String s){
           if(s==null || s.length() == 0){
                 System.out.println("Not a palindrome");
                return;
                }
           if(s.equals(reverse(s))){
                  System.out.println("Palindrome");
                 }
            else{
                System.out.println("Not a palidrome");
                }
    }
   private static String reverse(String s){
      String res = "";
        for(int i =s.length()-1; i >=0; i--){
            res += s.charAt(i);
             }
          return res;
          }
 
   public static void main(String args[]){
        String s = "a";
        isPalindrome(s);
        }
        }
