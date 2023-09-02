import java.util.*;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int max_candies = Integer.MIN_VALUE;

        for (int candy : candies) {
            if (candy > max_candies)
                max_candies = candy;
        }

        for (int candy : candies) {
            answer.add(candy + extraCandies >= max_candies);
        }
        
        return answer;
    }
}
