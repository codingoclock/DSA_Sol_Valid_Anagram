# Make your DSA life easy with GitHub solutions

# DSA_Sol_Valid_Anagram
A complete detailed solution of LeetCode Problem 242 - **Valid Anagram**

## Thinking Approach
What is Anagram? 

Two Strings are said to be **Anagram**, if the have the s**ame length** and **same frequency** of characters even if the **order of characters** are **different**.

You are given two strings - **String S and String T**. 

<details>

<Summary> Steps for the Procedure </Summary>

**First Step** - Check whether the **length of two strings are equal or not**. Proceed, if the length of strings are equal.

**Second Step** - Create a frequency (freq) array of **size 26**. Run a for loop which runs **till the length of String (S or T)**. Then, do two things:-

1. freq[s.charAt(i) - 'a']++   ---> This gets to the ith index of the String s and removes a character such at it becomes 0-index based [0-25] and it **increments** the count at ith index.
2. freq[t.charAt(i) - 'a']--   ---> Follows the same logic, but it **decrements** the count at the ith index.

**Third Step** - If the value at every index of freq array == 0. Then, the two strings are a Valid Anagram. It is TRUE. 

Otherwise, **return false**
</details>

**Time Complexity - O(N)

Space Complexity - O(26)**

Hence, this is the **complete detailed explanation** for the **LeetCode problem 242 of Valid Anagram**.






