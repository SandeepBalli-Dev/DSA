class Solution {

    // Leetcode 11 - https://leetcode.com/problems/container-with-most-water/

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;

        while(left < right) {

            int currArea = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(result, currArea);

            if(height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}