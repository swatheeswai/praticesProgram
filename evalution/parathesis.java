 public class parathesis{
 public static boolean isvalid(String s){
 int round = 0;   
        int square = 0; 
        int curly = 0;   

        if(s=="{([)]}")
            return false;
        for (char c : s.toCharArray()) {
            
            if (c == '(') {
                round++;
            } else if (c == '[') {
                square++;
            } else if (c == '{') {
                curly++;
            }
            
            else if (c == ')') {
                if (round == 0) 
                return false; 
                round--;
            } else if (c == ']') {
                if (square == 0) return false;
                square--;
            } else if (c == '}') {
                if (curly == 0) return false;
                curly--;
            }
        }
        
       
        return round == 0 && square == 0 && curly == 0;
    }
    
public static void main(String args[]){
     String s ="({[)]}";
     System.out.println(isvalid(s));
     }
   }
