<h2><a href="https://leetcode.com/problems/longest-substring-without-repeating-characters">Longest Substring Without Repeating Characters</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>Given a string <code>s</code>, find the length of the <strong>longest</strong> <span data-keyword="substring-nonempty"><strong>substring</strong></span> without repeating characters.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abcabcbb&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is &quot;abc&quot;, with the length of 3.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;bbbbb&quot;
<strong>Output:</strong> 1
<strong>Explanation:</strong> The answer is &quot;b&quot;, with the length of 1.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;pwwkew&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is &quot;wke&quot;, with the length of 3.
Notice that the answer must be a substring, &quot;pwke&quot; is a subsequence and not a substring.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>s</code> consists of English letters, digits, symbols and spaces.</li>
</ul>

## Solution Approach
The code you provided is a solution to the problem of finding the length of the longest substring without repeating characters in a given string `s`. The solution uses a sliding window approach to maintain a substring with no repeated characters.

Let's go through the code step by step:

1. `boolean map[] = new boolean[256];` - This creates a boolean array `map` of size 256, where each element represents the presence (`true`) or absence (`false`) of a character at its ASCII value index.

2. `int count = 0;` - This initializes a variable `count` to keep track of the length of the longest substring without repeating characters.

3. `int l = 0, r = 0;` - These variables `l` and `r` represent the left and right pointers of the current substring.

4. `while(r<s.length()) {` - This starts a loop that continues until the right pointer `r` reaches the end of the string `s`.

5. `char ch = s.charAt(r);` - This extracts the character at index `r` from the string `s`.

6. `while(map[ch]) {` - This inner loop is used to slide the left pointer `l` to the right until there are no repeated characters in the current substring.

7. `map[s.charAt(l)] = false;` - This sets the `map` value of the character at index `l` to `false`, indicating that it's no longer present in the substring.

8. `l++;` - This increments the left pointer `l` to slide it to the right.

9. `map[s.charAt(r)] = true;` - This sets the `map` value of the character at index `r` to `true`, indicating that it's present in the substring.

10. `count = Math.max(count, r-l+1);` - This updates the `count` variable with the maximum length of the current substring.

11. `r++;` - This increments the right pointer `r` to slide it to the right.

12. `return count;` - This returns the final length of the longest substring without repeating characters.

Overall, the solution has a time complexity of O(n), where n is the length of the input string `s`, as it uses a sliding window approach to iterate through the string and maintain the longest substring without repeating characters.
