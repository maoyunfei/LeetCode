package BestTimeToBuyAndSellStockII;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
        int[] prices2 = {1, 2, 3, 4, 5};
        System.out.println(maxProfit2(prices2));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; ) {
            int j = i + 1;
            for (; j < prices.length; j++) {
                if (prices[j] < prices[j - 1]) {
                    break;
                }
            }
            if (j - 1 > i) {
                profit += prices[j - 1] - prices[i];
                i = j;
            } else {
                i++;
            }
        }
        return profit;
    }

    public static int maxProfit2(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }

}
