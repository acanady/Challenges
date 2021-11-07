## Merge Sorted Array
**LeetCode 88**

You are given two integer arrays ```nums1``` and ```nums2```, sorted in **non-decreasing order**, and two integers ```m``` and ```n```, representing the number of elements in ```nums1``` and ```nums2``` respectively.

Merge ```nums1`` and ```nums2`` into a single array sorted in **non-decreasing order**.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, ```nums1``` has a length of ```m + n```, where the first ```m``` elements denote the elements that should be merged, and the last ```n``` elements are set to 0 and should be ignored. ```nums2``` has a length of ```n```

**Example 1**
```
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
```

**Example 2**
```
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
```

**Example 3**
```
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
```

Can you develop an algorithm that runs in O(m+n) time?

## Solution and Explanation
[MergeSortedArray.java](/JavaCodeChallenges/src/com/acanady/challengesolutions/MergeSortedArray.java)

This solution has a time complexity of O(m + n) and a space complexity of O(1).

We start with two pointers ```m_pointer``` and ```n_pointer``` for our ```num1``` and ```num2``` arrays respectively. These pointers point at the end of the arrays (the "end" of ```nums1``` is before the 0's).  We then iterate starting from the actual end (m+n) of ```num1``` and compare the values from ```m_pointer``` and ```n_pointer```. If ```m_pointer``` is bigger then we store that value at ```nums1[i]``` and decrement our pointer, we do the same for if ```n_pointer``` is bigger, choosing it's value and decrementing it. We also do a courtesy check on the ```m_pointer``` and ```n_pointer``` values to make sure that they have not moved out of bounds of the array, if they have then we copy over the remaining values from the other array.

### Note on why this method works

This method works because no values are ever really overwritten and so it avoids the issues that can arise with swapping. We can be guaranteed of this property since ```nums1``` will always have space for ```nums2```. Say that all values in ```nums2``` are bigger than ```nums1```, then the "space" at the front of ```nums1```, that is the zeros, will store the ```nums2``` values. Say that instead, the largest value was in ```nums1```, then the very end of the array (m+n) would have that value, and we would lose a 0; however, by decrementing our pointer, we effectively have created another 0, so we still have space for ```nums2```. At any given state, due to the decrementing, there will always be ```n-k``` open slots infront of ```m_pointer```, where ```k``` is how many values from ```num2```  have been merged into ```num1```. In this way we preserve the relative order of each list throughout the merge.