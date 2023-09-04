// class Solution {
//     public String freqAlphabets(String s) {
        
//     }
// }
class Solution {
    public String freqAlphabets(String s) {
        // Build a new String.
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        // Check if it is 2digit and # or not.
        while (i < s.length()) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                // Take the substring and append the value to result.
                int num = Integer.parseInt(s.substring(i, i + 2));
                result.append((char) ('j' + num - 10));
                i += 3;
            } else {
                // Take the number and append it to result.
                int num = s.charAt(i) - '0';
                result.append((char) ('a' + num - 1));
                i++;
            }
        }
        
        // Return the StringBuilder in the form of String.
        return result.toString();
    }
}