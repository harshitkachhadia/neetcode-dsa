class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int high = n - 1, low = 0;
        int ans = n;
        while(low <= high){
            int mid = (low + high)/2;

            if(target > nums[mid]) low = mid + 1;
            else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans; 
    }

}