import java.util.*;
class Main {

    // Leetcode 49 - https://leetcode.com/problems/group-anagrams/

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> asciiMap = new HashMap<>();

        for (String str : strs) {
            String sortedString = sortWord(str);
            asciiMap.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(asciiMap.values());
    }

    public static String sortWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
