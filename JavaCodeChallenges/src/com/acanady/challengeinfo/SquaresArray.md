# Squares of a Sorted Array
**LeetCode question**

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

**Extra:** Squaring each element and sorting the new array is very trivial, devise a solution that runs in O(n) time

**Example 1:**
```
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
```
**Example 2:**
```
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 
```
## Solution and Explantion
[SquaresArray.java](/JavaCodeChallenges/src/com/acanady/challengesolutions/SquaresArray.java)

### Solution 1
This solution uses two separate pointers that split the array into positive and negative sides
We start by moving the right pointer over to the first positive value, the left pointers is at the largest negative
value, remember -1 is larger than -5. We then compare the abs value of the right and left pointers, which ever value
is less we square it and add it to the squareArray, then we either increment the pointer, if on the right side, or
decrement the pointer, if on the left side. This solution runs in (O)n time but requires multiple if statements to determine
whether we have moved out of bounds of the array. (An array of only negative numbers for instance will result in a right
pointer that is out of bounds since we never found the "first positive number")

### Solution 2
Another solution with less if statements would involve setting a pointer at the beginning and end of the array
and comparing the abs value or squared values and then adding the bigger number to the squaredArray starting from the end.
We start from the end because, if we treat the array as two seperate sorted arrays with one sorted "backwards" (backwards because
the negative portion is backwards when squared), then comparing the first value of the backwards array gives you the largest
value that array holds, so the new array must likewise be filled in backwards.