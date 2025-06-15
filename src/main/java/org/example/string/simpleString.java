package org.example.string;

public class simpleString {
    public static int countVowels(String input) {
        int counter = 0;
        input = input.toLowerCase(); //his line converts the entire input string to lowercase.

        for (char c : input.toCharArray()) { //Converts the string into an array of characters ['h', 'e', 'l', 'l', 'o']
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                counter++;
            }
        }
        return counter;

    }// hello

    public static String reverseString(String input) {
        input = input.toLowerCase();
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) { //Keep looping as long as i is 0 or greater (until the first character).
            reverse += input.charAt(i); //gets the character at position i.

        }
        return reverse;
    }

    public static boolean palindromeCheck1(String input) {
        input = input.toLowerCase();  // make it lower case
        String reverse = ""; //start with empty string
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i); // build reversed string
        }
        return input.equals(reverse); //compare original and reversed
    }
    // Optimized version of palindrome check

    public static boolean palindromeCheck2(String input) {
        input = input.toLowerCase();
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
