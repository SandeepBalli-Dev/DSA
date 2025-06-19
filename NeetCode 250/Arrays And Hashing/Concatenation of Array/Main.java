class Main {

    // Leetcode 1929 - https://leetcode.com/problems/concatenation-of-array/

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n * 2];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = ans[i + n] = nums[i];
        }
        return ans;
    }
}