//You are given a large integer represented as an integer array digits, where each digits[i] is
// the ith digit of the integer. The digits are ordered from most significant to least significant in
// left-to-right order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int[] digits = {9};
        System.out.println(Arrays.toString(plusone(digits)));
    }

    static int[] plusone(int[] digits)
    {
        int n = digits.length;
        for(int i=n-1; i>=0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n+1];
        newNumber[0] = 1;
        return newNumber;
    }
}
