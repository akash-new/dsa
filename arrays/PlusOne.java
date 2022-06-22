/*
https://leetcode.com/problems/plus-one/
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Initial approach: I was trying to first convert it into a number by extracting digits but was running into a lot of type casting and data type issues especially for very large numbers. All of that is not required. You just need to handle two cases. Start from the last digit. If the digit is not 9, just increment it and we are done. If the digit is 9, then comes the tricky part. It would lead to that digit becoming 0 and 1 would carry forward. So whenever you encounter 9, just make the digit 0 and previous condition still applies. Finally if you see that the first digit is 0, it means that an extra digit needs to be added which will be one. For that create a new array. Set its first digit to 1 and copy the rest of the elements from the old array 
*/


class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1;i>=0;i--) {
            if(digits[i]!=9) {
                digits[i]++;
                break;
            } else {
                digits[i] =0;
            }
        }
        
        if(digits[0] ==0) {
            int [] resultArr = new int[n+1];
            resultArr[0] = 1;
            for(int i=1;i<n+1;i++) {
                resultArr[i] = digits[i-1];
            }
            return resultArr;
        }
        return digits;
    }
}
