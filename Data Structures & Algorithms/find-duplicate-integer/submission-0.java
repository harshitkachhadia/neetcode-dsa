class Solution {
    public int findDuplicate(int[] nums) {
        // Solution using Floyd's Cycle Detection

        int slow = nums[0];
        int fast = nums[0];

        // Phase 1 - Finding Meeting Place
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        // Phase 2 - Finding duplicate number

        slow = nums[0];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
