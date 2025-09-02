# Two Sum (LeetCode Challenge #1 -- Begin)

This was my **first challenge on LeetCode**.

At first, my idea was to solve it using **brute force**. I tried checking each number and the one next to it, like this:

```java
public int[] toSum(int[] nums, int target) {
    for (int i = 0; i < nums.length - 1; i++) {
        int number = nums[i] + nums[i + 1];
        if (number == target) {
            return new int[] { i, i + 1 };
        }
    }
    return null;
}
```

But... this solution is completely wrong. It only checks consecutive numbers (nums[i] + nums[i+1]), so it fails on most inputs. I also noticed I had an early return null inside the loop — a big logic mistake.

---

#### **Improve Solution:**

After thinking more carefully, I realized there was a much better way. The improved version uses a HashMap to store previously seen numbers. Then for each number, I calculate its complement using the formula:

```bash
complement = target - currentNumber
```

If the complement exists in the map, I’ve found the answer. Otherwise, I store the current number and its index.

```java

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (mp.containsKey(complement)) {
                return new int[] { mp.get(complement), i };
            }
            mp.put(nums[i], i);
        }
        return null;
    }
```

---

## **Problem Description:**

```md
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
```
