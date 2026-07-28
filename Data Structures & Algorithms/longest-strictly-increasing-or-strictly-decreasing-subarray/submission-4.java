class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int increasingCount = 1, descreasingCount = 1;
        int currentIncrCount = 1, currentDecrCount = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                currentIncrCount++;
                currentDecrCount = 1;
                increasingCount = Math.max(currentIncrCount, increasingCount);
            } else if (nums[i] < nums[i - 1]) {
                currentDecrCount++;
                currentIncrCount = 1;
                descreasingCount = Math.max(currentDecrCount, descreasingCount);
            } else {
                currentIncrCount = 1;
                currentDecrCount = 1;
            }
        }

        return Math.max(increasingCount, descreasingCount);
    }
}