class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPiles = Arrays.stream(piles).max().getAsInt();

        int low = 1, high = maxPiles;
        int ans = maxPiles;

        while(low <= high){
            int mid = low + (high - low) / 2;
            long totalHours = calculateTotalHours(piles,mid);

            if(totalHours <= h){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private long calculateTotalHours(int[] piles,int speed){
        long totalHours = 0;

        for(int bananas : piles){
            totalHours += (bananas + (long)speed - 1) / speed;
        }
        return totalHours;
    }
}
