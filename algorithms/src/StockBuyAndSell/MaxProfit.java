package StockBuyAndSell;
/*
Given an array prices[] of length N, representing the prices of the stocks on different days,
the task is to find the maximum profit possible by buying and selling the stocks on
different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell.
Note: Stock must be bought before being sold.

The idea is to use two nested loops to explore all the possible ways to buy and sell stock.
The outer loop decides the day to buy the stock and the inner loop decides the day to sell the stock.
The maximum difference between the selling price and buying price between every pair of days will be our answer.

*/
public class MaxProfit {
    public static void main(String[] args){
        int[] array = {7,10,1,3,6,9,2};
        System.out.println(getMaxProfit(array));
    }
    public static int getMaxProfit(int[] userInput) {
        int possibleMaxProfit = 0;
        for (int days = 0; days < userInput.length - 1; days++){
            for (int profit = days + 1; profit < userInput.length; profit++){
                possibleMaxProfit = getMax(possibleMaxProfit, userInput[profit]) - userInput[days];
            }
        }
        return possibleMaxProfit;
    }

    public static int getMax(int firstNumber, int secondNumber){
        int max = firstNumber;
        if(max < secondNumber) max = secondNumber;
        return max;
    }
}
