class Solution {
    public boolean xorGame(int[] nums) {
        // Key insight: 
        // If XOR of all numbers is 0 initially, Alice wins immediately
        // If XOR != 0, the game is determined by whether n (number of elements) is even
        // When n is even, Alice can always make moves to maintain the winning condition
        
        int xorSum = 0;
        for (int num : nums) xorSum ^= num;
        
        // Alice wins if XOR is 0 initially, OR if number of elements is even
        return xorSum == 0 || nums.length % 2 == 0;
    }
}