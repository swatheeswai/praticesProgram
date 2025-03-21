public class majority_duplicate {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 1, 1, 1, 4, 5, 6};
        int length = a.length; 

        for (int i = 0; i < a.length; i++) {
            int count = 0; 
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > length / 2) {
                System.out.println("Majority element: " + a[i]);
                 
            }
        }
    }
}
