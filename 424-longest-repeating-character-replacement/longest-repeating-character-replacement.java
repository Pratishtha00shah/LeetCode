class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        int maxCount = 0;
        int[] count = new int[26];
        int start = 0;

        // Loop through the string
        for (int end = 0; end < s.length(); end++) {
            // Update the maximum count of any character in the current window
            maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);
            
            // Check if the number of characters to be replaced exceeds the allowed replacements
            if (end - start + 1 - maxCount > k) {
                // If exceeds, move the start pointer to the right and decrement the count of character at the start
                count[s.charAt(start) - 'A']--;
                start++;
            }

            // Update the maximum length of the window
            maxLength = Math.max(maxLength, end - start + 1);
        }

        // Return the maximum length of the window
        return maxLength;
    }
}