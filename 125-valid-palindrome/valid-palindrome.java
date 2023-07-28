// class Solution {
//     public boolean isPalindrome(String s) {

// 			if(s.isEmpty()) {
// 				return false;
// 			}
//       int start = 0;
// 				int last = s.length() - 1;
// 				while(start <= last) {

// 					char curFirst = s.charAt(start);
// 					char curLast = s.charAt(last);

// 					if(!Character.isLetterOrDigit(curFirst)) {
// 						start++;
// 					} else if(!Character.isLetterOrDigit(curLast)) {
//         		last--;
// 					} else {
// 						if (Character.toLowerCase(curFirst) !=  Character.toLowerCase(curLast)) {
// 						return false;
// 					} 
					
// 					start++;
// 					last--;
// 				}
// 		}
// 		 return true;
// 	}
// }

class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length() - 1;
        
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}