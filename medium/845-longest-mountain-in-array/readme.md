# 845. Longest Mountain in Array

```
You may recall that an array arr is a mountain array if and only if:
	- arr.length &gt;= 3
	- There exists some index i (0-indexed) with 0 &lt; i &lt; arr.length - 1 such that:
	
		- arr[0] &lt; arr[1] &lt; ... &lt; arr[i - 1] &lt; arr[i]
		- arr[i] &gt; arr[i + 1] &gt; ... &gt; arr[arr.length - 1]
	
	
Given an integer array arr, return the length of the longest subarray, which is a mountain. Return 0 if there is no mountain subarray.
 
Example 1:
Input: arr = [2,1,4,7,3,2,5]
Output: 5
Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
Example 2:
Input: arr = [2,2,2]
Output: 0
Explanation: There is no mountain.
 
Constraints:
	- 1 &lt;= arr.length &lt;= 104
	- 0 &lt;= arr[i] &lt;= 104
 
Follow up:
	- Can you solve it using only one pass?
	- Can you solve it in O(1) space?
```