package LeetCode.Easy;

public class Q122 {
    public int maxProfit2(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int m = prices[0];
        int profit = 0;
        for(int p : prices){
            if(p >= m) {
                profit += p - m;
                m = p;
            }else {
                m = p;
            }
        }
        return profit;
    }
}
