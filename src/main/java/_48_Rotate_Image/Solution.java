package _48_Rotate_Image;

/**
 * Problem link: https://leetcode.com/problems/rotate-image/
 */
public class Solution {

    public void rotate(int[][] nums) {

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums[0].length;j++)
            {
                int temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }


        //reverse the elements row wise

        for(int i=0;i<nums.length;i++)
        {
            int li=0;
            int ri=nums[i].length-1;

            while(li<ri)
            {
                int temp=nums[i][li];
                nums[i][li]=nums[i][ri];
                nums[i][ri]=temp;

                li++;
                ri--;
            }
        }
    }

}
