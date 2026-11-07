class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);
        
        // Check if any element has a prime frequency
        for (int count : freq.values()) {
            if (isPrime(count)) return true;
        }
        return false;
    }
    
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}