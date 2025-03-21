class program22 {//duplicate array
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 2, 3, 5,1,1,1,1, 6, 6, 1, 3, 2};
        int b[] = new int[a.length]; 
        int count = 0;

       
        for (int i = 0; i < a.length; i++) {
            
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    
                   int already = 0;
                    for (int k = 0; k < count; k++) {
                        if (b[k] == a[i]) {
                            already = 1;
                            break;
                        }
                    }
                    
                    if (already==0) {
                        b[count] = a[i];
                        count++;
                    }
                    break; 
                }
            }
        }

        System.out.println("Duplicate values in the array:");
        for (int m = 0; m < count; m++) {
            System.out.println(b[m]);
        }

   
        System.out.println("Count of unique duplicate values: " + count);
    }
}
 
