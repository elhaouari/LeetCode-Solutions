package _11_Container_With_Most_Water;

/**
 * Problem Link: https://leetcode.com/problems/container-with-most-water/
 */
public class Solution {

    public int maxArea(int[] height) {

        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while ( left < right ) {

            int a = right - left;
            int b = Math.min(height[left], height[right]);

            maxArea = Math.max(maxArea, a * b);

            if (height[left] < height[right])
                ++left;
            else
                --right;
        }

        return maxArea;
    }
}
