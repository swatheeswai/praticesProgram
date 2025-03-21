public class logical2 {
    public static void printZigZag(String s, int k) {
        if (k == 1) {
            System.out.println(s);
            return;
        }

        int n = s.length();
        for (int i = 0; i < k; i++) {
            int j = 0;
            while (j < n) {
                if (j / (k - 1) % 2 == 0) {
                    System.out.print(s.charAt(j + i));
                } else {
                    System.out.print(s.charAt(j + k - 1 - i));
                }
                j += k;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String s = "thisisazigzag";
        int k = 4;
        printZigZag(s, k);
    }
}
