class Solution {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        // Start from sqrt(area) and go downwards to find the largest factor
        int sqrt = (int) Math.sqrt(area);
        for (int w = sqrt; w >= 1; w--) {
            if (area % w == 0) {
                result[0] = area / w;  // length
                result[1] = w;          // width
                break;
            }
        }
        return result;
    }
}