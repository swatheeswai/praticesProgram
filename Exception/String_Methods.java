package JavaProgram;

public final class Task {
    private final char[] c;

    
    Task(char[] c) {
        this.c = c;
    }

    
    public int lengths() {
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            count++;
        }
        return count;
    }

   
    public int getIndex(char val) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == val) {
                return i;
            }
        }
        return -1; 
    }

    
    public char getChar(char val) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == val) {
                return c[i];
            }
        }
        return '\0'; 
    }

   
    public boolean isContains(char val) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == val) {
                return true;
            }
        }
        return false;
    }

    public char[] Join(char val){
        char[] result = new char[c.length + 1];
       for (int i = 0; i< c.length; i++){
           result[i]+=c[i];
       }
       result[c.length] = val;
        return result;
    }
   public boolean startsWith(char val){
        for(int i =0 ;i<c.length;i++){
            if(c[0]==val){
                return true;
            }
        } 
        return false;
   }
   public boolean endsWith(char val){
        for(int i =0 ;i<c.length;i++){
             if (c.length > 0 && c[c.length - 1] == val){
                return true;
            }
        } 
        return false;
   }
   public boolean isEmpty(){
     if(c.length==0){
      return true;
   }
    return false;
   }
   public char[] upperCase() {
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                c[i] = (char) (c[i] - 32);
            }
        }
        return c;
    }
     public char[] lowerCase() {
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z') {
                c[i] = (char) (c[i] + 32);
            }
        }
        return c;
    }
    public char[] trim(){
          int count = 0;
    for (int i = 0; i < c.length; i++) {
        if (c[i] != ' ') {
            count++;
        }
    }
    char result[]= new char[count];
        int j = 0; 
    for (int i = 0; i < c.length; i++) {
        if (c[i] != ' ') {
            result[j++] = c[i];
        }
    }
    return result;
    }
    public boolean equals(char ch[]){
        for(int i=0; i<c.length;i++){
            for(int j=0;j<ch.length;j++){
                if(c[i]==ch[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public char[] replace(char oldval,char val){
           for(int i=0;i<c.length;i++){
              if(c[i] == oldval){
                c[i]=val;
              } 
           }
           return c;

    }
    
    
    public static void main(String[] args) {
       
        char[] ch = {' ','a', 'b', 'c', 'd','A',' '};

        
        Task t = new Task(ch);
        char ch2 []={' ','a', 'b', 'c', 'd','A',' '} ;
       
        System.out.println(t.lengths()); 
        System.out.println(t.getIndex('a')); 
        System.out.println(t.getChar('b')); 
        System.out.println(t.isContains('a')); 
        System.out.println(t.Join('z'));
        System.out.println(t.startsWith('a'));
        System.out.println(t.endsWith('d'));
        System.out.println(t.isEmpty());
        System.out.println(t.upperCase());
        System.out.println(t.lowerCase());
        System.out.println(t.trim());
        System.out.println(t.equals(ch2));
        System.out.println(t.replace('a','y'));

    }
}

