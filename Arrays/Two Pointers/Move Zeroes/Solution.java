class Solution {

    // Leetcode 283 - https://leetcode.com/problems/move-zeroes/

    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }
}