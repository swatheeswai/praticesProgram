public class equality {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 2, 3, 7,4,5};
        
        boolean equal = true;
        

        if (a1.length != a2.length) {
            equal = false;
        } else {
           
            for (int i = 0; i < a1.length; i++) {
               for(int j=0; j <a2.length; j++)
                if (a1[i] == a2[j]) {
                    equal = true;
                }
            }
        }
        
        if (equal) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}

