package dsa.arrays;

public class _002_Max_Subarray_Sum {

    public static int maxSubArray(int[] nums) {
        // return bruteForce(nums);
        return optimal(nums);
    }

    /**
     * time O(n) space O(1)
     * Kadane's algorithms
     */
    private static int optimal(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            maxSum = Math.max(maxSum, sum);
            sum = Math.max(sum, 0);
        }
        return maxSum;
    }

    /**
     * time O(n^2) space O(1)
     * intuition: generate all possible subarrays and check the sum
     */
    private static int bruteForce(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

}
