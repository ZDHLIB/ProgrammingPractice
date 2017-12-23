package Easy;

public class Q121 {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int m = prices[0];
        int profit = 0;
        for(int p : prices){
            if( p >= m ){
                profit = (p-m)>profit?(p-m):profit;
            }else{
                m = p;
            }
        }
        return profit;
    }
}
