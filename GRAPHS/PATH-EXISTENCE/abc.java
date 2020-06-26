import java.util.*;
class Solution
{
    boolean isSafe(int[][] grid,int i,int j,boolean[][] vis,int n)
    {
        return(i>=0 && i<n && j>=0 && j<n && !vis[i][j] && grid[i][j]!=0);
    }
    boolean dfs(int[][] grid,int i,int j,boolean[][] vis,int n)
    {
        if(isSafe(grid, i, j, vis, n))
        {
            if(grid[i][j]==2) return true;
            vis[i][j]=true;
            return (dfs(grid, i-1, j, vis, n) || dfs(grid, i+1, j, vis, n) || dfs(grid, i, j-1, vis, n) || dfs(grid, i, j+1, vis, n));
        }
        else return false;
    }
    boolean isPath(int[][] grid,int n)
    {
        boolean vis[][]=new boolean[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && !vis[i][j])
                {
                    if(dfs(grid,i,j,vis,n)) return true;
                }
            }
        }
        return false;
    }
}
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int grid[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                grid[i][j]=sc.nextInt();
            }
        }
        System.out.println(new Solution().isPath(grid, n));
        sc.close();
    }
}