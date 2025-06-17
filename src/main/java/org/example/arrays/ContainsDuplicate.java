package org.example.arrays;

import java.util.HashSet;
import java.util.Set;

// [1,2,3,4,5,6,1] nums
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
