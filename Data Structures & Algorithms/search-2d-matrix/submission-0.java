class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++){
            if(target >= matrix[i][0] && target <= matrix[i][m - 1]){
                return binarySearch(matrix[i] , target);
            }
        }
        return false;
    }

    public boolean binarySearch(int[] nums,int target){
        int high = nums.length - 1,low = 0;

        while(high >= low){
            int mid = (high + low)/2;
            if(nums[mid] == target) return true;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }

        return false;
    }
}
