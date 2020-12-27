package _62_UniquePaths;

/**
 * https://leetcode.com/problems/unique-paths/
 */
public class Solution {

    public int uniquePaths(int m, int n) {
        int[][] tracker = new int[m][n];
        return process(0,0,m,n,tracker);
    }

    private int process(int row,int col,int m,int n,int[][] tracker){
        if(row==m-1 && col==n-1)
            return 1;
        if(col==n || row==m)
            return 0;
        if(tracker[row][col]!=0)
            return tracker[row][col];
        int path1 = process(row,col+1,m,n,tracker);
        int path2 = process(row+1,col,m,n,tracker);
        tracker[row][col]=path1+path2;
        return tracker[row][col];
    }
}
