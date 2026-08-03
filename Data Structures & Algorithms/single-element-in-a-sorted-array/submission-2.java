class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];

        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int low = 1, high = n - 2;
        while(low <= high){
             int mid = (low + high) / 2;

            // Check if middle element is the unique one
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }

            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) ||
                (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                // Move to the right half
                low = mid + 1;
            }
            // If mid is in the right half (pairing broken earlier)
            else {
                // Move to the left half
                high = mid - 1;
            }
        }
        return -1;
    }
}