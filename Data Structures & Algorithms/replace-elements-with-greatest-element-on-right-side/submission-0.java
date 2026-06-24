class Solution {
    // Time: O(n) (single traversal)
    // Space: O(1)
    public int[] replaceElements(int[] arr) {
        int maxRight = -1;

        for(int i = arr.length - 1; i >= 0; i--){
            int current = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight,current);
        }
        return arr;
    }
}