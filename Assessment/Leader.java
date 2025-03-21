 class Leader {
    public static void main(String args[]) {
        int[] a = {16, 17, 4, 3, 5, 2};
        int n = a.length;
        int maxRight = a[n - 1]; 
        
        System.out.println("Leaders in the array:");
       System.out.println(maxRight);
        
        
        for (int i = n -2; i >= 0; i--) {
            if (a[i] > maxRight) {
                maxRight = a[i];
                System.out.println(maxRight);
            }
        }
         
    }
}

