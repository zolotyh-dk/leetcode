import java.util.Arrays;

public class _1480_RunningSumOf1dArray {
    public static void main(String[] args) {
        _1480_RunningSumOf1dArray solution = new _1480_RunningSumOf1dArray();
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(solution.runningSum(nums)));
    }

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i] + result[i - 1];
        }
        return result;
    }
}
