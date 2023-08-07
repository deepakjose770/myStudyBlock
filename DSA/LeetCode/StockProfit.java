package DSA.LeetCode;

import java.util.Arrays;

public class StockProfit {
    public static void main(String[] args) {
        int[] tradeData = {7,1,5,3,6,4};
        System.out.println(maxProfit(tradeData));
    }

    public static int maxProfit(int[] tradeData) {
        if (tradeData == null || tradeData.length <= 1) {
            return 0;
        }


        int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < tradeData.length; i++) {
            if(tradeData[i] <minVal) {
                minVal = tradeData[i];
            }
            else if(tradeData[i] - minVal > maxProfit) {
                maxProfit = tradeData[i] - minVal;
            }
        }
        return maxProfit;
    }
}
