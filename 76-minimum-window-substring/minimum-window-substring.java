class Solution {
    public static String minWindow(String s, String t) {
        
        // Create character frequency maps for both strings
        Map<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int start = 0; // Start index of the minimum window substring
        int minLen = Integer.MAX_VALUE; // Length of the minimum window substring
        int counter = t.length(); // Counter to track the characters in target string

        // Sliding window approach
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            // If c exists in target string, decrement its count in the frequency map
            if (targetMap.containsKey(c)) {
                if (targetMap.get(c) > 0) {
                    counter--;
                }
                targetMap.put(c, targetMap.get(c) - 1);
            }
            right++;

            // When the counter becomes 0, we have found a valid window
            while (counter == 0) {
                if (right - left < minLen) {
                    start = left;
                    minLen = right - left;
                }
                // Move the left pointer to minimize the window size
                char leftChar = s.charAt(left);
                if (targetMap.containsKey(leftChar)) {
                    targetMap.put(leftChar, targetMap.get(leftChar) + 1);
                    if (targetMap.get(leftChar) > 0) {
                        counter++;
                    }
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String minWindowSubstring = minWindow(s, t);
        System.out.println("Minimum Window Substring: " + minWindowSubstring);
    }
}