public class _643_MaximumAverageSubarrayI {
    public static void main(String[] args) {
        _643_MaximumAverageSubarrayI solution = new _643_MaximumAverageSubarrayI();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(solution.findMaxAverage(nums, k));
    }

    public double findMaxAverage(int[] nums, int k) {
        if (k < 1) {
            return 0.0;
        }

        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i];
            currentSum -= nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return (double) maxSum / k;
    }
}
