class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int num:nums){
            ans = ans ^ num;
        }

        return ans;
    }
}