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

// class Solution {
//     public String restoreString(String s, int[] indices) {
//         int n = s.length();
//         StringBuilder sb = new StringBuilder(s);

//         for(int i = 0; i < n; i++) {
//             sb.setCharAt(indices[i], s.charAt(i));
//         }

//         return sb.toString();
//     }
// }


class Solution {
  public String restoreString(String s, int[] indices) {
    int n = s.length();
    StringBuilder sb = new StringBuilder(s);

    for(int i=0; i<n; i++) {
      sb.setCharAt(indices[i], s.charAt(i));
    }

    return sb.toString();
  }
} 