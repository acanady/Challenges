## Two Sum Input II - Input Array Is Sorted

Given a **1-indexed** array of integers ```numbers``` that is already **sorted in non-decreasing order**
, find two numbers such that they add up to a specific ```target``` number. Let these two numbres be 
<code>numbers[index<sub>1</sub>]</code> and <code>numbers[index<sub>2</sub>]</code> where
<code>1<=index<sub>1</sub> < index<sub>2</sub> <= numbers.length</code>.

Return the *indices of the two numbers*, <code>index<sub>1</sub> and index<sub>2</sub></code>, **added by one**
as an integer array <code>[index<sub>1</sub>, index<sub>2</sub>]</code> of length 2

There is only ever **exactly one solution**

**Example 1**
```
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
```

**Example 2**
```
Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
```

**Example 3**

```
Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
```

## Solution and Explanation
[TwoSumInputII.java](/JavaCodeChallenges/src/com/acanady/challengesolutions/TwoSumInputII.java)

Now that we have a sorted array our solution can change. Intially with an unsorted
array we used a set to store our values to achieve fast runtime but that required extra space.
With a sorted array we can do all necessary calculations in O(1) space. 

We have  two pointers, one at the end and one at the beginning, we add the first value
to the last value and determine if it is equal to the target value. If it's two big we decrement
the end pointer, if it's too small we increment the beginning pointer. 

This solution works because our array is on order. Say, for instance, our target is 10 and  we  start
at both ends, our highest value is 5 and our lowest is 1, 5 + 1 is 6. 5 is our largest value, if we decremented our end
pointer, in this case, we could only ever get a smaller value, thus we must increment the start pointer which
will only ever increase in size. A similar argument is made for why we decrement the end pointer when we have
surpassed the target value.

Time Complexity: O(n)
Space Complexity: O(1)
