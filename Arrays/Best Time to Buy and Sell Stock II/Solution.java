class Solution {

    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

    public int maxProfit(int[] nums) {
        int maxProfit = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                maxProfit += nums[i] - nums[i - 1];
            }
        }
        return maxProfit;
    }
}