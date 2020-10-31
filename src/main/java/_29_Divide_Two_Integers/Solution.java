package _29_Divide_Two_Integers;

/**
 * Problem link: https://leetcode.com/problems/divide-two-integers/
 */
public class Solution {

    public int divide(int dividend, int divisor) {
        int count = 0;
        boolean dividendPositiveSign = dividend > 0;
        boolean divisorPositiveSign = divisor > 0;
        dividend = -Math.abs(dividend);
        divisor = -Math.abs(divisor);

        while (dividend <= divisor) {

            //Reset the dividend and counting factor every time it is greater than the dividend
            //Dividend is long because it could overflow, since we double it every iteration
            long tempDivisor = divisor;
            int countingFactor = 1;

            //Try to multiply (add to self) divisor evey iteration till its greater than dividend
            while (dividend <= tempDivisor) {
                dividend -= tempDivisor;
                count+=countingFactor;

                countingFactor += countingFactor;
                tempDivisor += tempDivisor;

            }
        }

        if (dividendPositiveSign && divisorPositiveSign || (!dividendPositiveSign && !divisorPositiveSign)) {
            if(count == Integer.MIN_VALUE){
                return Integer.MAX_VALUE;
            }
            return count;
        } else {

            return -count;
        }
    }
}
