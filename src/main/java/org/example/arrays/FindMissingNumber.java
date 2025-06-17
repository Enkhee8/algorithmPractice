package org.example.arrays;

//You're given an array containing n distinct numbers taken from the range 0 to n.
// That means one number is missing from the range.
//Input: [3, 0, 1]
//Output: 2
public class FindMissingNumber {
    public static int findMissingNum(int[] nums) {
        int n = nums.length;
        int actualSum = 0;
        int expectedSum = n * (n + 1) / 2;

        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }


}
