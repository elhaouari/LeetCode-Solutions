package _88_Merge_Sorted_Array;

/**
 * Problem link: https://leetcode.com/problems/merge-sorted-array/
 */
public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int lastIndex = nums1.length-1;
        int mIndex = m -1;
        int nIndex = n -1;

        while(nIndex>=0){
            if (mIndex>=0 && nums1[mIndex]>nums2[nIndex]){
                nums1[lastIndex] = nums1[mIndex];
                mIndex --;
            }else{
                nums1[lastIndex] = nums2[nIndex];
                nIndex--;
            }
            lastIndex--;
        }
    }

}
