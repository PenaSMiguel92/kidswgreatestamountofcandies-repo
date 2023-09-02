import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        List<Boolean> list1 = sol.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3);
        List<Boolean> list2 = sol.kidsWithCandies(new int[] { 4, 2, 1, 1, 2 }, 1);
        List<Boolean> list3 = sol.kidsWithCandies(new int[] { 12, 1, 12 }, 10);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
