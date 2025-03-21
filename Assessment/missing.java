class missing {
    public static void main(String[] args) {
        int[] a = {21,22,23,25};
        int n = a.length + 1; 
        int sum1 = n * (n + 1) / 2;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            sum2 += a[i];
        }
        int missingNumber = sum1 - sum2;
        System.out.println("The missing number is: " + missingNumber);
    }
}
