class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0) 
        return s;

        StringBuilder result = new StringBuilder();
        String[] splittedWords = s.split(" ");

        for(String word: splittedWords) {
            StringBuilder wordSb = new StringBuilder();

            wordSb.append(word);

            wordSb.reverse();

            result.append(wordSb.toString() + " ");
        }

        result.setLength(result.length() - 1);

        return result.toString();
    }
}