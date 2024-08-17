public class BuySellCrypto {
    public static void main(String[] args) {

        int[] num = {5, 1, 5, 6, 7, 1};

        int minprice = num[0];
        int maxprofit = 0;

        for (int i = 0; i < num.length; i++) {

            if (minprice > num[i]) {
                minprice = num[i];
            } else {
                int profit = num[i] - minprice;
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }

        if (maxprofit == 0) {
            System.out.println("No profit is made");
        } else {
            System.out.println("The max profit is " + maxprofit);
        }
    }
}