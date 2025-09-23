class Solution {

    // Leetcode 167 - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

    public int[] twoSum(int[] nums, int target) {
        
        int[] tempArray = new int[2];
        
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            if(nums[left] + nums[right] == target) {
                tempArray[0] = left + 1;
                tempArray[1] = right + 1;
                break;
            } else if(nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return tempArray;
    }
}