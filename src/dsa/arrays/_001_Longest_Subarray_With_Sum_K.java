package dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class _001_Longest_Subarray_With_Sum_K {

    public static int getLongestSubarraySize(int[] nums, int k) {
        // return bruteForce(nums, k);
        // return better(nums, k);
        return optimal(nums, k);
    }

    /**
     * time O(2n) space O(1)
     */
    private static int optimal(int[] nums, int k) {
        int low = 0, high = 0;
        int maxLen = 0;
        int sum = nums[0];

        while(high < nums.length){
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (low <= high && sum > k) {
                sum -= nums[low];
                low++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, high - low + 1);
            }

            // Move forward the right pointer:
            high++;
            if (high < nums.length) {
                sum += nums[high];
            }
        }

        return maxLen;
    }

    /**
     * time O(n*1) or O(n*logn) space O(n)
     * better approach when array consists non-negative numbers
     * optimal when array consists negative numbers
     */
    private static int better(int[] nums, int k) {
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i=0; i<nums.length; i++){
            //calculate the prefix sum till index i:
            sum += nums[i];

            // if the sum = k, update the maxLen:
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = sum - k;

            //Calculate the length and update maxLen:
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)){
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    /**
     * time O(n^2) space O(1)
     * intuition: generate all possible subarrays and check the sum
     */
    private static int bruteForce(int[] nums, int k) {
        int maxLen = 0;

        for(int i=0; i<nums.length; i++) {
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }

        return maxLen;
    }

}
