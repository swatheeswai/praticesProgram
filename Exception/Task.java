public final class Task {

    private final char[] c;

    
    Task(char[] c) {
        this.c = c;
    }

    
    public int lengths() {
        return c.length;
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

    
    public Task Join(char val) {
        char[] result = new char[c.length + 1];
        System.arraycopy(c, 0, result, 0, c.length);
        result[c.length] = val;
        return new Task(result); 
    }

    
    public boolean startsWith(char val) {
        return c.length > 0 && c[0] == val;
    }

   
    public boolean endsWith(char val) {
        return c.length > 0 && c[c.length - 1] == val;
    }

    
    public boolean isEmpty() {
        return c.length == 0;
    }

   
    public Task upperCase() {
        char[] result = c.clone(); 
        for (int i = 0; i < result.length; i++) {
            if (result[i] >= 'a' && result[i] <= 'z') {
                result[i] = (char) (result[i] - 32);
            }
        }
        return new Task(result); 
    }

    
    public Task lowerCase() {
        char[] result = c.clone(); 
        for (int i = 0; i < result.length; i++) {
            if (result[i] >= 'A' && result[i] <= 'Z') {
                result[i] = (char) (result[i] + 32);
            }
        }
        return new Task(result); // Return a new Task with the updated array
    }

    // Method to trim spaces from both ends of the array
    public Task trim() {
        int count = 0;
        // Count the non-space characters
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ') {
                count++;
            }
        }
        char[] result = new char[count];
        int j = 0; 
        // Fill the new array with non-space characters
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ') {
                result[j++] = c[i];
            }
        }
        return new Task(result); // Return a new Task with the trimmed array
    }

    // Method to check if two arrays are equal
    public boolean equals(char[] ch) {
        if (c.length != ch.length) {
            return false; // Arrays have different lengths, so they're not equal
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ch[i]) {
                return false; // Arrays differ at some position
            }
        }
        return true; // Arrays are equal
    }

    // Method to replace a character with another
    public Task replace(char oldval, char val) {
        char[] result = c.clone(); // Create a copy of the array to modify
        for (int i = 0; i < result.length; i++) {
            if (result[i] == oldval) {
                result[i] = val;
            }
        }
        return new Task(result); // Return a new Task with the updated array
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        char[] ch = {' ', 'a', 'b', ' ', 'c', 'd', 'A', ' '};
        Task t = new Task(ch);
        char[] ch2 = {' ', 'a', 'b', 'c', 'd', 'A', ' '};
        
        System.out.println(t.lengths()); // Length of array
        System.out.println(t.getIndex('a')); // Index of 'a'
        System.out.println(t.getChar('b')); // Get character 'b'
        System.out.println(t.isContains('a')); // Check if 'a' is contained
        System.out.println(t.Join('z').lengths()); // Join 'z' at the end
        System.out.println(t.startsWith(' ')); // Check if it starts with ' '
        System.out.println(t.endsWith(' ')); // Check if it ends with ' '
        System.out.println(t.isEmpty()); // Check if empty
        System.out.println(t.upperCase().lengths()); // Convert to uppercase
        System.out.println(t.lowerCase().lengths()); // Convert to lowercase
        System.out.println(t.trim().lengths()); // Trim spaces
        System.out.println(t.equals(ch2)); // Check if arrays are equal
        System.out.println(t.replace('a', 'y').lengths()); // Replace 'a' with 'y'
    }
}

