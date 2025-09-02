# Palindrome Number (LeetCode Challenge #2 -- Begin)

This solution has two ways: only with math or using Strings.  
I used the first one — only math:

```java
package Beging.palindrome_number.solution;

public class Resolution {
   public boolean isPalindrome(int x) {
      if (x < 0)
         return false;
      int originalNumber = x;
      int reverseNumber = 0;
      while (x > 0) {
         int digit = x % 10;
         reverseNumber = reverseNumber * 10 + digit;
         x /= 10;
      }
      return originalNumber == reverseNumber;
   }
}
```

## **Problem Description:**

```md
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:

-231 <= x <= 231 - 1

Follow up: Could you solve it without converting the integer to a string?
```
