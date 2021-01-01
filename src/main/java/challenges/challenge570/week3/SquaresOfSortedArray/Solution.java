package challenges.challenge570.week3.SquaresOfSortedArray;

/**
 * https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/571/week-3-december-15th-december-21st/3567/
 */
public class Solution {

    public int[] sortedSquares(int[] nums) {
        // return Arrays.stream(nums).map(x -> x * x).sorted().toArray();

        int[] res = new int[nums.length];
        int left = 0, right = nums.length-1;
        int resIndex = nums.length-1;

        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                res[resIndex--] = nums[left] * nums[left];
                left++;
            }else{
                res[resIndex--] = nums[right] * nums[right];
                right--;
            }
        }

        return res;
    }
}
