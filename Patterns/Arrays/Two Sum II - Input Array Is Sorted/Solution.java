class Solution {

    // Leetcode 167 - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

    public int[] twoSum(int[] nums, int target) {
        int [] newArray = new int[2];
        
        int i = 0;
        int j = nums.length - 1;

        while(i < j) {
            if(nums[i] + nums[j] == target) {
                newArray[0] = i + 1;
                newArray[1] = j + 1;
                break;
            } else if(nums[i] + nums[j] < target) {
                i++;
            } else {
                j--;
            }
          
        }
        return newArray;

    }
}