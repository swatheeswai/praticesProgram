public class zero {
    public static void main(String args[]) {
        int a[] = {1, 4, 0, 2, 5, 0, 3, 0};
        int index = 0;

        
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        
        for (int i = 0; i < a.length; i++) {
            if (a[i]!= 0) {
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
                index++;
            }
        }

        System.out.print("Modified array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
