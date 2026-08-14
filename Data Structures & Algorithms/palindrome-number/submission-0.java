class Solution {
    public boolean isPalindrome(int x) {
        int revVal = 0;
        int originalVal = x;
        while(x > 0){
            int lastDigit = x % 10;
            revVal = (revVal * 10) + lastDigit;
            x /= 10;
        }

        return originalVal == revVal;
    }
}