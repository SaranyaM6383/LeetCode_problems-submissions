# 338. Counting Bits

```
Given an integer n, return an array ans of length n + 1 such that for each i (0 &lt;= i &lt;= n), ans[i] is the number of 1's in the binary representation of i.
 
Example 1:
Input: n = 2
Output: [0,1,1]
Explanation:
0 --&gt; 0
1 --&gt; 1
2 --&gt; 10
Example 2:
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --&gt; 0
1 --&gt; 1
2 --&gt; 10
3 --&gt; 11
4 --&gt; 100
5 --&gt; 101
 
Constraints:
	- 0 &lt;= n &lt;= 105
 
Follow up:
	- It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?
	- Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?
```