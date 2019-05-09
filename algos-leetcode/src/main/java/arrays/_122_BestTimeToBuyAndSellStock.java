/*
 * Developed by GSK on 5/8/19 3:44 PM.
 * Last Modified 5/8/19 3:44 PM.
 * Copyright (c) 2019.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package arrays;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 *
 * Note that you cannot sell a stock before you buy one.
 *
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 *
 */
public class _122_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        return maxProfit_approach2(prices);
    }


    // Approach-2
    // Complexity O(n)
    private int maxProfit_approach2(int[] prices) {
        if(prices.length < 2){
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices[0];   // To track min Price

        for(int price: prices){
            if(price > minPrice){
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
            else{
                minPrice = price;
            }
        }
        return maxProfit;
    }


    // Approach-1: Using Two Loops.
    // Complexity: O(n2)
    private int maxProfit_approach1(int[] prices) {
        int maxProfit = 0;
        for(int i=0; i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                int profit = prices[j] - prices[i];
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }
}
