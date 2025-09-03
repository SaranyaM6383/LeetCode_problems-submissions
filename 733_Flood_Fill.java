class Solution {
    private void dfs(int row,int col,
                     int [][]image,
                     int [][] ans,
                     int []delRow,int []delCol,int iniColor,int newColor){
        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;

        for(int i=0;i<4;i++){
            int nRow = row + delRow[i];
            int nCol = col + delCol[i];
            if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && image[nRow][nCol]==iniColor && image[nRow][nCol]!=newColor){
                dfs(nRow,nCol,image,ans,delRow,delCol,iniColor,newColor);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor = image[sr][sc];
        if(iniColor == color) return image;
        int [][] ans = image;
        int []delRow = {0,-1,0,+1};
        int []delCol = {+1,0,-1,0};
        dfs(sr,sc,image,ans,delRow,delCol,iniColor,color);
        return ans;
    }
}

