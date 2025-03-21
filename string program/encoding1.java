//String example
class encoding1 {
    public static void main(String args[]) {
        String word = "LEAF";
        String encode = "";
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            char shifting;

           
            if (i % 2 == 0) { 
                shifting = (char) (ch + 1);
            } else {
                shifting = (char) (ch - 1); 
            }
            encode += shifting; 
        }
        
        System.out.println("Encoded word: " + encode);    
         }
}

           
         
           
           
          
        
  

