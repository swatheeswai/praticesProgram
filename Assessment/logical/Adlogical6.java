class Adlogical6{

   
    public static boolean wordExists(char[][] matrix, String word) {
        int rows = matrix.length;
        if (rows == 0) return false;
        int cols = matrix[0].length;
        if (cols == 0) return false;
        
        int len = word.length();
        
       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols - len; j++) {
                boolean found = true;
                for (int k = 0; k < len; k++) {
                    if (matrix[i][j + k] != word.charAt(k)) {
                        found = false;
                        break;
                    }
                }
                if (found) return true;
            }
        }
        
       
        for (int i = 0; i <= rows-len ; i++) {
            for (int j = 0; j < cols; j++) {
                boolean found = true;
                for (int k = 0; k < len; k++) {
                    if (matrix[i + k][j] != word.charAt(k)) {
                        found = false;
                        break;
                    }
                }
                if (found) return true;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        char[][] matrix = {
            {'F', 'A', 'C', 'I'},
            {'O', 'B', 'Q', 'P'},
            {'A', 'N', 'O', 'B'},
            {'M', 'A', 'S', 'S'}
        };
        
        String word1 = "FOAM";
        String word2 = "MAAS";
        
        System.out.println(wordExists(matrix, word1)); 
        System.out.println(wordExists(matrix, word2)); 
    }
}

