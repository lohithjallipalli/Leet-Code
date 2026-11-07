class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        
        int[] need = new int[26];
        int[] window = new int[26];
        for (char c : s1.toCharArray()) need[c - 'a']++;
        
        int left = 0, right = 0, valid = 0;
        while (right < s2.length()) {
            int idx = s2.charAt(right) - 'a';
            right++;
            if (need[idx] != 0) {
                window[idx]++;
                if (window[idx] == need[idx]) valid++;
            }
            
            while (right - left > s1.length()) {
                int d = s2.charAt(left) - 'a';
                left++;
                if (need[d] != 0) {
                    if (window[d] == need[d]) valid--;
                    window[d]--;
                }
            }
            
            if (valid == countNonZero(need)) return true;
        }
        return false;
    }
    
    private int countNonZero(int[] arr) {
        int count = 0;
        for (int v : arr) if (v != 0) count++;
        return count;
    }
}