class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;

        // suffix[i] = total stones from i to n-1
        int[] suffix = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        int[][] dp = new int[n][n + 1];

        // Build from the end towards the beginning
        for (int i = n - 1; i >= 0; i--) {

            for (int M = 1; M <= n; M++) {

                int maxTake = Math.min(2 * M, n - i);

                // Can take all remaining piles
                if (maxTake == n - i) {
                    dp[i][M] = suffix[i];
                    continue;
                }

                int best = 0;

                for (int X = 1; X <= maxTake; X++) {

                    int newM = Math.max(M, X);

                    // Current player gets all remaining stones
                    // minus what opponent can get.
                    int current = suffix[i] - dp[i + X][newM];

                    best = Math.max(best, current);
                }

                dp[i][M] = best;
            }
        }

        return dp[0][1];
    }
}