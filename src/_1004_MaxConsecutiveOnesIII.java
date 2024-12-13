public class _1004_MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        _1004_MaxConsecutiveOnesIII solution = new _1004_MaxConsecutiveOnesIII();
        int[] nums = {0 ,0 ,1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        System.out.println(solution.longestOnes(nums, k));
    }

    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int result = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
