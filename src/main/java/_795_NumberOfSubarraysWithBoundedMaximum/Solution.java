package _795_NumberOfSubarraysWithBoundedMaximum;

/**
 * https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/
 */
public class Solution {

    public int numSubarrayBoundedMax(int[] arr, int l, int r) {
        int ans=0;
        int i=0,j=0;
        int pcount=0;
        while(j<arr.length){
            if(arr[j]<l){
                ans+=pcount;
            }else if(arr[j]>r){
                i=j+1;
                pcount=0;
            }else{
                pcount=(j-i+1);
                ans+=pcount;
            }
            j++;
        }
        return ans;
    }
}
