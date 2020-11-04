package _832_Flipping_an_Image;

/**
 * Problem link: https://leetcode.com/problems/flipping-an-image/submissions/
 */
public class Solution {

    public int[][] flipAndInvertImage(int[][] A) {
        int size = A.length;
        int[][] result = new int[size][size];
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                result[r][c] = 1 - A[r][size - 1 - c];
            }
        }
        return result;
    }
}
