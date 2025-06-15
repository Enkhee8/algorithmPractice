package org.example;

import java.util.Arrays;

import static org.example.arrays.FindMax.*;
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

    }
}