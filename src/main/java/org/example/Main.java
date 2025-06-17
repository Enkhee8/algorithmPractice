package org.example;

import org.example.arrays.FindMinimumNumber;

import java.util.Arrays;

import static org.example.arrays.ContainsDuplicate.containsDuplicate;
import static org.example.arrays.FindMax.*;
import static org.example.arrays.FindMinimumNumber.minNumber;
import static org.example.arrays.FindMissingNumber.findMissingNum;
import static org.example.arrays.TwoSum.twoSum;
import static org.example.string.simpleString.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 54};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // print the full array

        int[] numbers = {99, 54, 564, 436, 5774};
        System.out.println(findMaxNumber(numbers));
        System.out.println(countEvenNumbers(numbers));

        String words = "Hello World enkhee";
        System.out.println(countVowels(words));

        System.out.println(reverseString("Hello"));
        System.out.println(palindromeCheck2("Madam"));

        int smallest = FindMinimumNumber.minNumber(nums);
        System.out.println(smallest);

        int[] n = {0,1,3};
        int missing = findMissingNum(n);
        System.out.println("The missing number is: " + missing);

        int[] duplicate = {1,2,3,4,5,6,3};
        boolean duplicateNums = containsDuplicate(duplicate);
        System.out.println(duplicateNums);




    }
}