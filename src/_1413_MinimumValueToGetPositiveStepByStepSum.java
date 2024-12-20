public class _1413_MinimumValueToGetPositiveStepByStepSum {
    public static void main(String[] args) {
        _1413_MinimumValueToGetPositiveStepByStepSum solution = new _1413_MinimumValueToGetPositiveStepByStepSum();
        int[] nums1 = {-3,2,-3,4,2};
        int[] nums2 = {1,2};
        int[] nums3 = {1,-2,-3};
        System.out.println(solution.minStartValue(nums1));
        System.out.println(solution.minStartValue(nums2));
        System.out.println(solution.minStartValue(nums3));
    }

    public int minStartValue(int[] nums) {
        int currentSum = nums[0];
        int minSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum += nums[i];
            minSum = Math.min(minSum, currentSum);
        }
        if (minSum >= 1) {
            return 1;
        } else {
            return 1 - minSum;
        }
    }
}
