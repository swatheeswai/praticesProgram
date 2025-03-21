public class Clockwise {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
         
        System.out.println("Original elements:");
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }

        int lastElement = a[a.length - 1]; 
        

        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        
        a[0] = lastElement; 

        System.out.println();
        System.out.println("After shifting elements:");
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }
    }
}

