class Solution {
    public int bulbSwitch(int n) {
        // The bulbs that remain on are exactly those at positions that are perfect squares
        // A bulb is toggled once for each of its divisors
        // Only perfect squares have an odd number of divisors
        return (int) Math.sqrt(n);
    }
}