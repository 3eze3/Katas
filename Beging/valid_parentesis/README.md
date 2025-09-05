# Valid Parentheses (LeetCode Challenge #5 -- Begin)

The solution is quite simple and efficient:

###### **My logic:**

This problem is very common in college-level coding, and the key idea is to use a stack — that’s more important than using a HashMap or Map.

Whenever you see an opening symbol like '(', '{', or '[', you push it onto the stack.
Why?
Because the stack keeps track of the most recent opening symbol — the last one added is always on top.

When you encounter a closing symbol, you pop from the stack and check if it matches.
You can do this with a Map (to match pairs), or with simple if conditions.

If the top of the stack doesn't match the current closing symbol, you return false.

Finally, if the stack is empty at the end, it means all brackets were matched properly — so we return true.
Problem solved! :).

```java
package Beging.valid_parentesis.Solution;

import java.util.Map;
import java.util.Stack;

public class Resolution {
    public boolean validParentheses(String symbols) {
        Map<Character, Character> pairSymbols = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> arraysSymbols = new Stack<>();
        Character firsword = symbols.charAt(0);
        if (!pairSymbols.containsKey(firsword))
            return false;

        for (int i = 0; i < symbols.length(); i++) {
            Character current = symbols.charAt(i);
            if (pairSymbols.containsKey(current)) {
                arraysSymbols.push(current);
            } else {
                if (arraysSymbols.isEmpty())
                    return false;
                Character top = arraysSymbols.pop();
                if (pairSymbols.get(top) != current)
                    return false;

            }

        }

        return arraysSymbols.isEmpty();
    }
}

```

## **Problem Description:**

```md
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
```
