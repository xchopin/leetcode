/**
Xavier Chopin
submitted at Jul 08, 2025 18:11


Runtime
2ms
Beats
73.73%


Memory
61.22MB
Beats
92.47%

*/

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int res = 0;

        if (prices == null) {
            return res;
        }

        int buy = 0;
        int sell = 0;

        while (sell < prices.length) {
            if (prices[sell] < prices[buy]) {
                buy = sell;
            }

            res = Math.max(res, prices[sell] - prices[buy]);

            sell++;
        }
        
        return res;
    }

}
