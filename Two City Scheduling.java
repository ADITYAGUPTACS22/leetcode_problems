class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int t = costs.length/2;
        int ans = 0;
        Arrays.sort(costs,(a,b)-> Integer.compare(a[0]-a[1],b[0]-b[1]));

        for(int i = 0;i < t; i++){
            ans += costs[i][0] + costs[i + t][1];
        }
        return ans;
    }
}
