# Longest Common Prefix (LeetCode Challenge #4 -- Begin)

The solution was very easy:

The solution is quite simple and efficient:

###### **Why Sorting?**

By sorting the array alphabetically, you automatically bring words that share common prefixes closer together. The first and last words in the sorted list will be the most "distant" in terms of commonality, meaning the common prefix must also be a prefix of both these words.

Sorting minimizes the need to compare all the words with each other; instead, we only need to compare the first and the last word in the sorted list.

**Approach:**

- Sort the words alphabetically: This brings words with similar prefixes close together.
- Compare the first and last word: These two words will define the common prefix since sorting arranges them based on lexicographic order.
- Limit the comparison: You only need to compare up to the length of the shorter word between the first and last word in the sorted list.
- Build the common prefix: Iterate through the characters of both the first and last word, and stop when the characters differ.

```java
package Beging.longest_common_prefix.Solution;

import java.util.Arrays;

public class Resolution {
    public String getLogestCommonPrefix(String[] words) {
        if (words.length == 1)
            return words[0];
        Arrays.sort(words);
        String firstWord = words[0];
        String lasttWord = words[words.length - 1];
        StringBuilder longestPrefix = new StringBuilder();
        for (int i = 0; i < Math.min(firstWord.length(), lasttWord.length()); i++) {
            if (lasttWord.charAt(i) == firstWord.charAt(i)) {
                longestPrefix.append(lasttWord.charAt(i));
            } else {
                break;
            }
        }
        return longestPrefix.toString();
    }

}

```

## **Problem Description:**

```md
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
```
