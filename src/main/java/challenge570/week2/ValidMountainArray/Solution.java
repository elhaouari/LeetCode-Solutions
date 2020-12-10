package challenge570.week2.ValidMountainArray;

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
