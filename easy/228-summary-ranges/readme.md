# 228. Summary Ranges

```
You are given a sorted unique integer array nums.
A range [a,b] is the set of all integers from a to b (inclusive).
Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
Each range [a,b] in the list should be output as:
	- "a-&gt;b" if a != b
	- "a" if a == b
 
Example 1:
Input: nums = [0,1,2,4,5,7]
Output: ["0-&gt;2","4-&gt;5","7"]
Explanation: The ranges are:
[0,2] --&gt; "0-&gt;2"
[4,5] --&gt; "4-&gt;5"
[7,7] --&gt; "7"
Example 2:
Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2-&gt;4","6","8-&gt;9"]
Explanation: The ranges are:
[0,0] --&gt; "0"
[2,4] --&gt; "2-&gt;4"
[6,6] --&gt; "6"
[8,9] --&gt; "8-&gt;9"
 
Constraints:
	- 0 &lt;= nums.length &lt;= 20
	- -231 &lt;= nums[i] &lt;= 231 - 1
	- All the values of nums are unique.
	- nums is sorted in ascending order.
```