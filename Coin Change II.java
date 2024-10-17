class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[] a:dp){
            Arrays.fill(a, -1);
        }
        return Change_II(coins, amount, 0,dp);
    }
    public static int Change_II(int[] coin, int amount, int i,int [][]dp ) {
        if (amount == 0) {
            return 1;
        }
        if (i == coin.length) {
            return 0;
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        int inc = 0;
        int exc = 0;
        if (amount >= coin[i]) {
            inc = Change_II(coin, amount - coin[i], i,dp);
        }

        exc = Change_II(coin, amount, i + 1,dp);

        return dp[i][amount]=inc+exc;
}
}
