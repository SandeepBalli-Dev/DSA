class Solution {

    //Leetcode 643 - https://leetcode.com/problems/maximum-average-subarray-i/

    public double findMaxAverage(int[] nums, int k) {
        double currSum = 0;
        double maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < k ; i++) {
            currSum += nums[i];
        }
        maxSum = Math.max(maxSum, currSum / k);
        int start = 0;
        int end = k;
        while(end < nums.length) {
            currSum -= nums[start];
            currSum += nums[end];
            maxSum = Math.max(maxSum , currSum / k);
            start++;
            end++;
        }
        return maxSum;
    }
}