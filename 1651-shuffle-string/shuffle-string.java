//  class Solution {
//     public String restoreString(String s, int[] indices) {
//         int n = s.length();
//         char arr[] = new char[n];
//         for(int e=0; e<n; e++)
//         {
//             arr[indices[e]]=s.charAt(e);
//         }

//         return new String(arr);
//     }
// }

class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length(); // Get the length of the original string
        StringBuilder sb = new StringBuilder(s);
         // Create a StringBuilder object and initialize with the original string

        for(int i = 0; i < n; i++) {
            sb.setCharAt(indices[i], s.charAt(i)); 
            // Set the character at indices[i] to the character at position i in the original    string
        }

        return sb.toString(); 
        // Convert the StringBuilder object to a string and return the restored string
    }
}

