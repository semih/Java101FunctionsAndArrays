package main.java;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class Solution {

    public static int maxProfit(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }

        int maxDifference = 0;

        for(int i=0; i<prices.length; i++) {

            for(int j=i+1; j<prices.length; j++ ) {
                if(prices[j] - prices[i] > maxDifference) {
                    maxDifference = prices[j] - prices[i];
                }
            }
        }

        return maxDifference;
    }

    /*    public static int maxProfit(int[] prices) {

            if(prices.length == 0) {
                return 0;
            }

            int minSoFar = prices[0];
            int maxProfit = 0;

            for(int i=1; i< prices.length; i++) {
                if(prices[i] < minSoFar) {
                    minSoFar = prices[i];
                }
                if (prices[i] - minSoFar > maxProfit){
                    maxProfit = prices[i] - minSoFar;
                }
            }
            return maxProfit;
        }*/

}
