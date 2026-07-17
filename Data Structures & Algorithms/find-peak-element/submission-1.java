class Solution {
    public int findPeakElement(int[] nums) {
        // Using Binary Search

        int high = nums.length - 1, low = 0;
        while(high > low){
            int mid = low + (high - low)/2;

            if(nums[mid] < nums[mid + 1]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }

        return high;
    }
}