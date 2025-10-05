# 417. Pacific Atlantic Water Flow

```
There is an m x n rectangular island that borders both the Pacific Ocean and Atlantic Ocean. The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches the island's right and bottom edges.
The island is partitioned into a grid of square cells. You are given an m x n integer matrix heights where heights[r][c] represents the height above sea level of the cell at coordinate (r, c).
The island receives a lot of rain, and the rain water can flow to neighboring cells directly north, south, east, and west if the neighboring cell's height is less than or equal to the current cell's height. Water can flow from any cell adjacent to an ocean into the ocean.
Return a 2D list of grid coordinates result where result[i] = [ri, ci] denotes that rain water can flow from cell (ri, ci) to both the Pacific and Atlantic oceans.
 
Example 1:
Input: heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
Explanation: The following cells can flow to the Pacific and Atlantic oceans, as shown below:
[0,4]: [0,4] -&gt; Pacific Ocean 
       [0,4] -&gt; Atlantic Ocean
[1,3]: [1,3] -&gt; [0,3] -&gt; Pacific Ocean 
       [1,3] -&gt; [1,4] -&gt; Atlantic Ocean
[1,4]: [1,4] -&gt; [1,3] -&gt; [0,3] -&gt; Pacific Ocean 
       [1,4] -&gt; Atlantic Ocean
[2,2]: [2,2] -&gt; [1,2] -&gt; [0,2] -&gt; Pacific Ocean 
       [2,2] -&gt; [2,3] -&gt; [2,4] -&gt; Atlantic Ocean
[3,0]: [3,0] -&gt; Pacific Ocean 
       [3,0] -&gt; [4,0] -&gt; Atlantic Ocean
[3,1]: [3,1] -&gt; [3,0] -&gt; Pacific Ocean 
       [3,1] -&gt; [4,1] -&gt; Atlantic Ocean
[4,0]: [4,0] -&gt; Pacific Ocean 
       [4,0] -&gt; Atlantic Ocean
Note that there are other possible paths for these cells to flow to the Pacific and Atlantic oceans.
Example 2:
Input: heights = [[1]]
Output: [[0,0]]
Explanation: The water can flow from the only cell to the Pacific and Atlantic oceans.
 
Constraints:
	- m == heights.length
	- n == heights[r].length
	- 1 &lt;= m, n &lt;= 200
	- 0 &lt;= heights[r][c] &lt;= 105
```