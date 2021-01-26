package _223_RectangleArea;

/**
 * https://leetcode.com/problems/rectangle-area/
 */
public class Solution {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {


        int left1 = A, bottom1 = B, right1 = C, top1 = D;
        int left2 = E, bottom2 = F, right2 = G, top2 = H;

        int sq1 = (right1-left1)*(top1-bottom1);
        int sq2 = (right2-left2)*(top2-bottom2);

        if (right1<left2 || right2<left1) {
            return sq1 +sq2;
        }
        if (top1<bottom2 || top2<bottom1) {
            return sq1 + sq2;
        }

        int left = Math.max(left1,left2);
        int right = Math.min(right1,right2);
        int bottom = Math.max(bottom1,bottom2);
        int top = Math.min(top1,top2);

        return sq1 + sq2 - (top-bottom)*(right-left);
    }
}
