import java.util.*;

class Solution {

// Leetcode 14 - https://leetcode.com/problems/longest-common-prefix/


// Topics
// premium lock icon
// Companies
// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char [] firstWord = strs[0].toCharArray();
        char [] lastWord = strs[strs.length - 1].toCharArray();

        StringBuilder newString = new StringBuilder("");
        for(int i = 0; i < firstWord.length; i++) {
            if(firstWord[i] != lastWord[i]) {
                break;
            }
            newString.append(firstWord[i]);
        }
        return newString.toString();
    }
}