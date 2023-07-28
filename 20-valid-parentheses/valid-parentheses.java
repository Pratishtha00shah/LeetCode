import java.util.Stack;

 class Solution{
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || 
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "()[]{}";
        System.out.println(str1 + " is valid: " + isValid(str1));

        String str2 = "({[]})";
        System.out.println(str2 + " is valid: " + isValid(str2));

        String str3 = "([)]";
        System.out.println(str3 + " is valid: " + isValid(str3));

        String str4 = "]";
        System.out.println(str4 + " is valid: " + isValid(str4));
    }
} 