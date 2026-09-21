package programming_fundamentals.practice_problems;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        BestTimeToBuyAndSellStock obj =
                new BestTimeToBuyAndSellStock();

        int result = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}