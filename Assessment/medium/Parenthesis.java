 class Parenthesis {
    public static void main(String[] args) {
        String s = "Sometimes ()when I nest (them (my parentheticals) too much (like this (and this)) they get) confusing.";
        int count = 0;
        //int pos = 10; 
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                count++;
                if(count==1)
                {
                System.out.println("opening parenthesis position: " + i);
                }
            } else if (ch == ')') {
                count--;
                if (count == 0) {
                    System.out.println("Closing parenthesis position: " + i);
                    break; 
                }
            }
        }
    }
}

