class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//         wp - word  pointer
//         lp - letter pointer
        int wp1 = 0;
        int lp1 = 0;
        int wp2 = 0;
        int lp2 = 0;
//This will continue until the words in one of the arrays run out
        while (wp1 < word1.length && wp2 < word2.length){       
            if(word1[wp1].charAt(lp1) != word2[wp2].charAt(lp2)){
                return false;
            }
            lp1++;
            lp2++;
//If the letters of the current word have ended, then go to the next word
            if(lp1 >= word1[wp1].length()){
                lp1 = 0;
                wp1++;
            }
            if(lp2 >= word2[wp2].length()){
                lp2 = 0;
                wp2++;
            }
        }
//If both arrays came to an end at the same time, then return "true", otherwise "false".
        return wp1 == word1.length &&
            wp2 == word2.length;        
    }
}