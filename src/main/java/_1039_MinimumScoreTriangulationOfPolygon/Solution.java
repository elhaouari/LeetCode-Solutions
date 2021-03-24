package _1039_MinimumScoreTriangulationOfPolygon;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-score-triangulation-of-polygon/
 */
public class Solution {

    Map<String, Integer> dp = new HashMap<>();

    public int minScoreTriangulation(int[] A) {
        return solve(A , 0 , A.length - 1 , new int[50][50]);
    }


    public int solve(int arr[] , int strt , int end , int dp[][]) {
        if(end - strt == 2) {
            return dp[strt][end] = arr[strt] * arr[strt + 1] * arr[end];
        }

        if(dp[strt][end] != 0) return dp[strt][end];

        int ans = Integer.MAX_VALUE;
        for(int i = strt + 1 ; i < end; i++) {
            int f = arr[strt] * arr[i] * arr[end];
            int s = (i - strt > 1) ? solve(arr , strt , i , dp) : 0;
            int t = solve(arr , i , end , dp);
            ans = Math.min(ans , f + s + t);
        }

        dp[strt][end] = (ans == Integer.MAX_VALUE) ? 0 : ans;

        return dp[strt][end];
    }
}
