class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        // For negative numbers, use two's complement by adding 2^32
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        // Handle negative numbers by converting to positive
        long n = num;
        if (n < 0) n = n & 0xFFFFFFFFL;
        
        while (n > 0) {
            sb.append(hexChars[(int)(n & 0xF)]);
            n >>= 4;
        }
        return sb.reverse().toString();
    }
}