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

## Solution Explanation

This particular problem tests proper use of data structures. In our solution
we utilize a hash set ```num_set``` to determine whether or not a value is currently in the array by adding
that value to the set. Values in a set are unique and a duplicate cannot be added, the function
to add a value to the set will return false if the value already exists. This solution has a space
complexity of ```O(n)``` since, at most, we will add every elmeent in ```num``` to the ```num_set```
