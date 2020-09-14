package _6_ZigZagConversion;

public class Solution {
    public String convert(String s, int numRows) {

        StringBuilder[] arr = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }

        int index = 0; boolean isMovingDown = true;
        for(int i = 0; i < s.length(); i++){

            arr[index].append(s.charAt(i));


            index = isMovingDown ? index + 1 : index - 1;

            if (index == -1) {
                isMovingDown = true;
                index += 2;
                if ( index > numRows) index = numRows;
            }
            if (index == numRows) {
                isMovingDown = false;
                index -= 2;
                if ( index < 0) index = 0;
            }
        }

        for (int i = 1; i < numRows; i++) {
            arr[0].append(arr[i]);
        }

        return arr[0].toString();
    }
}
