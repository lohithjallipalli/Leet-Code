class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        // Key insight about XOR pairing:
        // For each pair (nums1[i], nums2[j]), we compute nums1[i] ^ nums2[j]
        // The XOR of all such pairs depends on the frequencies of each number
        
        // If we XOR a number with itself, the result is 0
        // So pairs where nums1[i] appears an even number of times will cancel out
        
        int xor1 = 0, xor2 = 0;
        for (int num : nums1) xor1 ^= num;
        for (int num : nums2) xor2 ^= num;
        
        // If nums1 has odd length, each nums2 element appears odd times in the XOR sum
        // If nums2 has odd length, each nums1 element appears odd times
        // If both have odd length, the XORs combine
        
        int result = 0;
        if (nums1.length % 2 == 1) result ^= xor2;
        if (nums2.length % 2 == 1) result ^= xor1;
        
        return result;
    }
}