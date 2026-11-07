class Solution {
    public boolean isStrictlyPalindromic(int n) {
        // A number is strictly palindromic if its representation in every base 2 to n-2 is palindromic
        // Key insight: In base n-2, the number is always "12" (since n = 1*(n-2) + 2)
        // "12" is never a palindrome, so no number can be strictly palindromic
        // Therefore, the answer is always false
        
        return false;
    }
}