class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean map[] = new boolean[256];
        int count = 0;
        int l = 0, r = 0;

        while(r<s.length()) {
            char ch = s.charAt(r);

            while(map[ch]) {
                map[s.charAt(l)] = false;
                l++;
            }
            map[s.charAt(r)] = true;
           count = Math.max(count, r-l+1);
           r++;
        }
        return count;
    }
}