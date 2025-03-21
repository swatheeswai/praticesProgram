public class Solution {
    public int longestSubstringWithKDistinct(String s, int k) {
        // Edge case: if k is 0, we cannot have any distinct characters
        if (k == 0) return 0;
        
        int left = 0, maxLength = 0;
        int[] count = new int[26];  // Array to store frequency of characters (for lowercase 'a' to 'z')
        int distinctCount = 0;  // To keep track of the number of distinct characters in the current window
        
        // Iterate over the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // Add the character at position 'right' to the window
            char currentChar = s.charAt(right);
            int index = currentChar - 'a';  // Map 'a' to index 0, 'b' to index 1, ..., 'z' to index 25
            
            if (count[index] == 0) {
                distinctCount++;  // New distinct character
            }
            count[index]++;  // Increment the frequency of the current character
            
            // Shrink the window if we have more than 'k' distinct characters
            while (distinctCount > k) {
                char leftChar = s.charAt(left);
                int leftIndex = leftChar - 'a';
                count[leftIndex]--;  // Decrease the frequency of the character at the left pointer
                
                if (count[leftIndex] == 0) {
                    distinctCount--;  // We removed a distinct character
                }
                
                left++;  // Shrink the window by moving the left pointer to the right
            }
            
            // Calculate the max length of valid window
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcba";
        int k = 2;
        System.out.println(solution.longestSubstringWithKDistinct(s, k));  // Output: 3 ("bcb")
    }
}

