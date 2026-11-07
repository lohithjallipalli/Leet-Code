class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // Two rectangles overlap if:
        // - rec1's left < rec2's right AND rec1's right > rec2's left
        // - rec1's bottom < rec2's top AND rec1's top > rec2's bottom
        return rec1[2] > rec2[0] && rec1[3] > rec2[1] && 
               rec2[2] > rec1[0] && rec2[3] > rec1[1];
    }
}