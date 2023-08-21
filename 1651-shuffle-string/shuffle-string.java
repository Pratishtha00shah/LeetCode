class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char arr[] = new char[n];
        for(int e=0; e<n; e++)
        {
            arr[indices[e]]=s.charAt(e);
        }

        return new String(arr);
    }
}