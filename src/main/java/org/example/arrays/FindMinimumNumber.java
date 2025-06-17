package org.example.arrays;

//2,4,6,5,3,6,1
public class FindMinimumNumber {
    public static int minNumber(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}
