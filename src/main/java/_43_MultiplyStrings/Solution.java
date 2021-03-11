package _43_MultiplyStrings;

/**
 * https://leetcode.com/problems/multiply-strings/
 */
public class Solution {
    public String multiply(String num1, String num2) {
        if(num1.length()>num2.length()){
            //  num1 is always smaller and num2 is always greeater
            String tmp = num1;
            num1 = num2;
            num2 = tmp;
        }

        int n1 = num1.length();
        int n2 = num2.length();
        int res[] = new int[n1+n2];
        for(int i=n1-1;i>=0;i--){
            int carry = 0;
            int val1 = Character.getNumericValue(num1.charAt(i));
            int itr = i+n2;
            for(int j=n2-1;j>=0;j--){
                int val2 = Character.getNumericValue(num2.charAt(j));
                int sum = (val1*val2+carry+res[itr]);
                res[itr--] = (sum)%10;
                carry = sum/10;
            }
            while(carry>0){
                int sum = (res[itr]+carry);
                res[itr] = sum%10;
                carry = sum/10;
                itr--;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<res.length){
            if(res[i]!=0)
                break;
            i++;
        }
        if(i==res.length)
            return "0";
        while(i<res.length){
            sb.append(res[i++]);
        }
        return sb.toString();
    }
}