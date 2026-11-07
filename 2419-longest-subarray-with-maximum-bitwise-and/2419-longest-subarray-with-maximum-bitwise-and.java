class Solution {
    public int longestSubarray(int[] nums) {
        // Find the maximum value in the array
        int maxVal = Arrays.stream(nums).max().getAsInt();
        
        // Find the longest consecutive subarray where all elements equal maxVal
        int maxLen = 0, currentLen = 0;
        for (int num : nums) {
            if (num == maxVal) {
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            } else {
                currentLen = 0;
            }
        }
        return maxLen;
    }
}