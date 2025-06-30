package dsa.arrays;

public class _003_Best_Time_to_Buy_and_Sell_Stock {

    public static int maxProfit(int[] nums){
        // return bruteForce(nums);
        return optimal(nums);
    }

    /**
     * time O(n) space O(1)
     */
    private static int optimal(int[] nums) {
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < minBuy){
                minBuy = nums[i];
            }
            int currProfit = nums[i] - minBuy;
            if(currProfit > maxProfit){
                maxProfit = currProfit;
            }
        }
        return maxProfit;
    }

    /**
     * time O(n^2) space O(1)
     */
    private static int bruteForce(int[] nums) {
        int maxProfit = 0;
        for(int i=1; i<nums.length; i++){
            int minBuy = Integer.MAX_VALUE;
            for(int j=0; j<i; j++){
                if(nums[j] < minBuy){
                    minBuy = nums[j];
                }
            }

            int profit = nums[i] - minBuy;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

}
