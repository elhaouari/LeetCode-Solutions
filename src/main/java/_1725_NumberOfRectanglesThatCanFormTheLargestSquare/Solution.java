package _1725_NumberOfRectanglesThatCanFormTheLargestSquare;

/**
 * https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/
 */
public class Solution {

    public int countGoodRectangles(int[][] rectangles) {
        int maxSize = 0;
        int result = -1;
        for (int[] rectangle : rectangles) {
            int size = Math.min(rectangle[0], rectangle[1]);
            if (size > maxSize) {
                maxSize = size;
                result = 1;
            } else if (size == maxSize) {
                ++result;
            }
        }

        return result;
    }

}
