class Solution {
    public int arrangeCoins(int n) {
        // Binary search: find k such that k*(k+1)/2 <= n < (k+1)*(k+2)/2
        long left = 1, right = n;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sum = mid * (mid + 1) / 2;
            if (sum == n) return (int) mid;
            else if (sum < n) left = mid + 1;
            else right = mid - 1;
        }
        return (int) right;
    }
}