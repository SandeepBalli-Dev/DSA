class Solution {

//  Leetcode 169 - https://leetcode.com/problems/majority-element/

    public int majorityElement(int[] nums) {
        int curr = 0;
        int count = 0;
        for(int num : nums) {
            if(count == 0) {
                curr = num;
            }
            if(num == curr) {
                count++;
            } else {
                count--;
            }
        }
        return curr;
    }
}