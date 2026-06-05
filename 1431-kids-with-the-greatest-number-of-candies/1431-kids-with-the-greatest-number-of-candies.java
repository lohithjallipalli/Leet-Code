import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> answer = new ArrayList<>();

        int max = candies[0];

        // Find maximum candies
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        // Check each kid
        for (int candy : candies) {
            answer.add(candy + extraCandies >= max);
        }

        return answer;
    }
}