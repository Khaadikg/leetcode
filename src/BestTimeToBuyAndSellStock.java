public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4})); //-> 5
        System.out.println(maxProfit(new int[]{7,6,4,3,1})); //->0
        System.out.println(maxProfit(new int[]{1,2})); //->1
        System.out.println(maxProfit(new int[]{2,1,4})); //-> 3
    }
    public static int maxProfit(int[] prices) {
        int max = 0;
        int length = prices.length;
        int isOdd = 1;
        if (prices.length % 2 == 1) {
            isOdd = 2;
        }
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length / 2 + isOdd; j++) {
                if (prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                }
                if (prices[length - j + i] - prices[i] > max) {
                    max = prices[length - j + i] - prices[i];
                }
            }
        }
        return max;
    }
}
