## Contains Duplicate

**LeetCode quesiton 217**
**Difficulty:** Easy

Given an integer array ```nums```, return ```true``` if any value appeares **at least twice** in the array, and return ```false``` if every element is distinct.

**Example 1**
```
Input: nums = [1,2,3,1]
Output: true
```
**Example 2:**
```
Input: nums = [1,2,3,4]
Output: false
```

**Example3:**
```
Input: nums = [1,1,1,3,3,4,3,2,5,2]
Output: true
```

Time complexity: O(n)

## Solution and Explanation
[ContainsDuplicate.java]()
This particular problem tests proper use of data structures. In our solution
we utilize a hash set ```num_set```. Sets contain only unique elements, attempting to add a duplicate to a set will return false in java. We can use this functionality to build our solution.

Solution has a space complexity of ```O(n)``` since, at most, we will add every elmement in ```num``` to the ```num_set```

There exists a solution with a space compexity ```O(1)```