## Intersectino of Two Arrays II

**LeetCode question 350**

**Example 1**
```
Input: nums1=[1,2,2,1] nums2 = [2,2]
Output: [2,2]
```

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
```

##Solution and Explanation
[IntersectionTwoArrays.java](/JavaCodeChallenges/src/com/acanady/challengesolutions/IntersectionTwoArrays)

Using an ArrayList and a Hashtable we store the frequencies of one of the arrays. We then
iterate through the second array and , for every element that exists in the hashtable who
has a frequency greater than 0, we add it to our list. In this way we allow for  duplicates, that is
there are two 2's in ```nums1``` and two 2's in ```nums2``` then our ```Arraylist``` will have two 2's as well.

We then must iterate through the length of our ```ArrayList``` and add our values to
an ```int[] array```.

Time Complexity: O(m+n)
Space Copmlexity: O(m+n)