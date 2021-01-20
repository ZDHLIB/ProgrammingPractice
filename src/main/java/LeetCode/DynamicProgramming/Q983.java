package LeetCode.DynamicProgramming;

public class Q983 {
    private static int[] memo;
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        memo = new int[n];
        return solve(0, days, costs);
    }

    private static int solve(int i, int[] days, int[] costs){

        int n = days.length;

        if(i >= n){
            return 0;
        }

        if(memo[i] > 0) return memo[i];

        int k = 0;

        int cost1 = costs[0] + solve(i + 1, days, costs);

        while(i + k < n){
            if(days[i + k] - days[i] < 7){
                k++;
            } else {
                break;
            }
        }
        int cost7 = costs[1] + solve(i + k, days, costs);

        while(i + k < n){
            if(days[i + k] - days[i] < 30){
                k++;
            } else {
                break;
            }
        }
        int cost30 = costs[2] + solve(i + k, days, costs);

        memo[i] = Math.min(cost1, Math.min(cost7, cost30));
        return memo[i];
    }
}
