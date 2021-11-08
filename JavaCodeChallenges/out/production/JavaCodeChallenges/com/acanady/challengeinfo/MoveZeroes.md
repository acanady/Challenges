## Move Zeroes

Given an integer array ```nums```, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

**Example 1**
```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
```

## Solution
[MoveZeroes.java](/JavaCodeChallenges/src/com/acanady/challengesolutions/MoveZeroes.java)

For this solution, we keep track of how many zeroes we have seen. For each 
non-zero value that we encounter we move it to the left that many times. In this way we shift the array down ```k``` times,
where ```k``` is the number of ```0's``` we've encountered. We then loop through the array from the end to
```length-k``` and write in our ```0's```.

**Time complexity** : 0(n)

**Space complexity** : 0(1)
 