class Main {
     
     public static void main(String[] args) {
         
         int nums[] = new int[]{2,5,9,8,1};
         int currMax = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            currMax = Math.max(currMax, nums[i]);
        }
        System.out.println("Largest Element in Array, " + currMax);
     }
}