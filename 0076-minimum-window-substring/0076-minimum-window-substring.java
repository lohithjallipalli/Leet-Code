class Solution {
    public String minWindow(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) return "";
        
        int[] need = new int[128];
        int[] window = new int[128];
        int left = 0, right = 0;
        int valid = 0;
        int start = 0, len = (int) 1e9;
        
        for (char c : t.toCharArray()) need[c]++;
        
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (need[c] != 0) {
                window[c]++;
                if (window[c] == need[c]) valid++;
            }
            
            while (valid == (int) countNonZero(need)) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                char d = s.charAt(left);
                left++;
                if (need[d] != 0) {
                    if (window[d] == need[d]) valid--;
                    window[d]--;
                }
            }
        }
        return len == (int) 1e9 ? "" : s.substring(start, start + len);
    }
    
    private int countNonZero(int[] arr) {
        int count = 0;
        for (int v : arr) if (v != 0) count++;
        return count;
    }
}