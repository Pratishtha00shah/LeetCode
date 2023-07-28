// class Solution {
//     public String longestPalindrome(String s) {
        
//         if(s == null || s.length() < 1){
//             return "";
//         }
//         int left = 0; int right = 0;
//         for(int i=0; i<s.length(); i++){
//             int len1 = checkPalindrome(s, i, i);
//             int len2 = checkPalindrome(s, i, i+1);
//             int len = Math.max(len1, len2);
//             if(len > right - left){
                
//                 left = i-(len - 1)/2;
//                 right = i + len/2;
//             }
//         }  
//         return s.substring(left,right+1); 
//     }
    
//     public int checkPalindrome(String s, int left, int right){
        
//         int L = left, R = right;
        
//         while(L >=0 && R<s.length() && s.charAt(L) == s.charAt(R)){
            
//             L--;
//             R++;    
//         }
        
//         return R-L-1;
//     }
// }
        

        class Solution {
    int maxLen = 0;
    int lo = 0;
    public String longestPalindrome(String s) {
        char[] input = s.toCharArray();
        if(s.length() < 2) {
            return s;
        }
        
        for(int i = 0; i<input.length; i++) {
            expandPalindrome(input, i, i);
            expandPalindrome(input, i, i+1);
        }
        return s.substring(lo, lo+maxLen);
    }
    
    public void expandPalindrome(char[] s, int j, int k) {
        while(j >= 0 && k < s.length && s[j] == s[k]) {
            j--;
            k++;
        }
        if(maxLen < k - j - 1) {
            maxLen = k - j - 1;
            lo = j+1;
        }
    }
}