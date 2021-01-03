package challenges.januaryLeetcodingChallenge_2021.BeautifulArrangement;

/**
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3591/
 */
public class Solution {

    public int countArrangement(int n) {
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = i + 1;
        }
        return generate(n, arr);
    }

    private int generate(int k, int[] arr) {
        int count = 0;

        if (k == 1)
            return 1;
        else {
            for (int i=0; i<k; i++) {
                swap(arr, i, k-1);

                if (arr[k-1]%k == 0 || k % arr[k-1] == 0)
                    count += generate(k - 1, arr);

                swap(arr, i, k-1);
            }
        }
        return count;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}