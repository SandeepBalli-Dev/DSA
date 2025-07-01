class Main {

    // Leetcode 27 - https://leetcode.com/problems/remove-element/

       public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = 0;
        while (end < nums.length) {
            if(nums[start] != val && nums[end] != val) {
                start++;
                end++;
            } else if(nums[start] == val && nums[end] != val) {
                swap(nums, start, end);
                start++;
                end++;
            } else if(nums[start] == val && nums[end] == val) {
                end++;
            } else {
                end++;
            }
        }
        return start;
    }

    public void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

}