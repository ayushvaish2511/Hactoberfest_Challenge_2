class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) 
    {
        int m = grid.length;
        int n = grid[0].length;
        int r = (k/n)%m;
        int c = k%n;
        
        int[][] a = new int[m][n];
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                a[r][c] = grid[i][j];
                if(r==m-1 && c==n-1)
                {
                    r = 0;
                    c = 0;
                }
                else if(c == n-1)
                {
                    r++;
                    c = 0;
                }
                else 
                {
                    c++;
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<m; i++)
        {
            List<Integer> samp = new ArrayList<>();
            for(int j = 0; j<n; j++)
            {
                samp.add(a[i][j]);
            }
            ans.add(samp);
        }
        return ans;
    }
}