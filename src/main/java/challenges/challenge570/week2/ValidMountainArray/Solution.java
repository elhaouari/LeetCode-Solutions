package challenges.challenge570.week2.ValidMountainArray;

/**
 * https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/570/week-2-december-8th-december-14th/3561/
 */
class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        if (arr[0] > arr[1]) return false;

        boolean turend = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1])
                turend = true;
            else if (arr[i] == arr[i-1] || turend)
                return false;
        }

        return turend;
    }
}
