/*Find All Triplets with Zero Sum
Question: Find all unique triplets in the array that sum to zero.

Input: [-1, 0, 1, 2, -1, -4]

Output: [[-1, -1, 2], [-1, 0, 1]]*/

import java.util.Arrays;

class ZeroSum {
   public static void main(String args[]) {
       int[] a = {-1, 0, 1, 2, -1, -4};

       
       Arrays.sort(a);

       for (int i = 0; i < a.length - 2; i++) {
          
           if (i > 0 && a[i] == a[i - 1]) continue;

           for (int j = i + 1; j < a.length - 1; j++) {
              
               if (j > i + 1 && a[j] == a[j - 1]) continue;

               for (int k = j + 1; k < a.length; k++) {
                   
                   if (k > j + 1 && a[k] == a[k - 1]) continue;

                   int sum = a[i] + a[j] + a[k];
                   if (sum == 0) {
                       System.out.println("[" + a[i] + ", " + a[j] + ", " + a[k] + "]");
                   }
               }
           }
       }
   }
}

           
       
