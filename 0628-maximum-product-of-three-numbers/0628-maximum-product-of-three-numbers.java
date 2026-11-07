class Solution {
    public int maximumProduct(int[] nums) {
        // Sort the array, then the max product is either:
        // 1. product of three largest numbers, or
        // 2. product of two smallest (possibly negative) and the largest
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n-1] * nums[n-2] * nums[n-3],
                       nums[0] * nums[1] * nums[n-1]);
    }
}