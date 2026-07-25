class Solution {
    public int maxProductDifference(int[] nums) {
        int firstMax = 0,secondMax = 0;
        int firstMin = Integer.MAX_VALUE,secondMin = Integer.MIN_VALUE;

        for(int num:nums){
            if(num >= firstMax){
                secondMax = firstMax;
                firstMax = num;
            }else if(num > secondMax){
                secondMax = num;
            }

            if(num <= firstMin){
                secondMin = firstMin;
                firstMin = num;
            }else if(num < secondMin){
                secondMin = num;
            }
        }

        return (firstMax * secondMax) - (firstMin * secondMin);
    }
}