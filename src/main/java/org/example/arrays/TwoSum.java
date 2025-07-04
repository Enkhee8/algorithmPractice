package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers and a target value, return the indices of the two numbers that
// add up to the target
//Input: nums = [2, 7, 11, 15], target = 9
//Output: [0, 1]  // because nums[0] + nums[1] == 9
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{
                        map.get(complement), i
                };
            }
            map.put(nums[i], i);

        }
        return new int[]{-1, -1};

    }
}
