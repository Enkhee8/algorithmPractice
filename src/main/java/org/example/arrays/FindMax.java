package org.example.arrays;

//Problem: Given an array of integers, return the largest number.
//4,3,4,5,6
public class FindMax {
    public static int findMaxNumber(int[] nums) {
        int max = nums[0]; // start with first element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int countEvenNumbers(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
// 1,2,3,4

}
