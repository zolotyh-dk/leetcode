import java.util.Arrays;
import java.util.HashMap;

public class _1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsIndexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsIndexes.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int pair = target - nums[i];
            if (numsIndexes.containsKey(pair) && numsIndexes.get(pair) != i) {
                return new int[]{i, numsIndexes.get(pair)};
            }
        }
        return null;
    }
}
