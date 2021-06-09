package _1005_MaximizeSumOfArrayAfter_K_Negations;

import java.util.Arrays;

public class Solution {

    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int countNegative = 0;
        for (; nums[countNegative] < 0; countNegative++);

        int total = 0;
        if(k <= countNegative){
            for(int i = 0; i < k; i++){
                total -= nums[i];
            }
            for(int i = k; i < nums.length; i++){
                total += nums[i];
            }
        }
        if( k > countNegative ){
            for(int i = 0; i < countNegative; i++){
                nums[i] = -nums[i];
            }
            int rem = (k-countNegative) % 2;
            if(rem==0){
                for (int num : nums) {
                    total += num;
                }
            }
            else{
                Arrays.sort(nums);
                for (int num : nums) {
                    total += num;
                }
                total -= 2*nums[0];
            }}

        return total;
    }
}
