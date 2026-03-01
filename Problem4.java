// Program 4 - Calculate Profit and Profit Percentage

class Problem4 {
    public static void main(String[] args) {

        // Store cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculate profit
        int profit = sellingPrice - costPrice;

        // Calculate profit percentage
        double profitPercentage = (profit / (double)costPrice) * 100;

        // Display results
        System.out.println("The Cost Price is INR " + costPrice + 
                           " and Selling Price is INR " + sellingPrice);

        System.out.println("The Profit is INR " + profit + 
                           " and the Profit Percentage is " + profitPercentage);
    }
}