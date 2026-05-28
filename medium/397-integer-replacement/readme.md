# 397. Integer Replacement

```
Given a positive integer n, you can apply one of the following operations:
	- If n is even, replace n with n / 2.
	- If n is odd, replace n with either n + 1 or n - 1.
Return the minimum number of operations needed for n to become 1.
 
Example 1:
Input: n = 8
Output: 3
Explanation: 8 -&gt; 4 -&gt; 2 -&gt; 1
Example 2:
Input: n = 7
Output: 4
Explanation: 7 -&gt; 8 -&gt; 4 -&gt; 2 -&gt; 1
or 7 -&gt; 6 -&gt; 3 -&gt; 2 -&gt; 1
Example 3:
Input: n = 4
Output: 2
 
Constraints:
	- 1 &lt;= n &lt;= 231 - 1
```