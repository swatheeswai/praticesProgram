
 class consecutive {
    public static void main(String[] args) {
        int a[] = {49, 1, 3, 200, 2, 4, 70, 5};
        int temp = 0;     
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
          int maxlength = 1;
        int currentlength = 1;
        
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + 1 == a[i + 1]) {
                currentlength++;
            } else {
                if (currentlength > maxlength) {
                    maxlength = currentlength;
                }
                
            }
        }
      
        System.out.println("Length of the longest consecutive elements sequence: " + maxlength);
    }
}


