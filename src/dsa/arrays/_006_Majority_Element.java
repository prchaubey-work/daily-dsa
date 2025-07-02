package dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class _006_Majority_Element {

    public static int majorityElement(int[] nums) {
        // return bruteForce(nums);
        // return better(nums);
        return optimal(nums);
    }

    /**
     * Boyer-Moore Voting Algorithm
     * time O(2n) space O(1)
     */
    private static int optimal(int[] nums) {
        int count = 0;
        int candidate = -1;

        // Phase 1: Find a potential candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate
        int frequency = 0;
        for (int num : nums) {
            if (num == candidate) {
                frequency++;
            }
        }

        return (frequency > nums.length / 2) ? candidate : -1;
    }

    /**
     * time O(n) space O(n)
     */
    private static int better(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int threshold = nums.length / 2;
        for(int num : nums){
            int count = freq.getOrDefault(num, 0) + 1;
            if(count > threshold) return num;
            freq.put(num, count);
        }

        return -1;
    }

    /**
     * time O(n^2) space O(1)
     */
    private static int bruteForce(int[] nums) {
        for (int num : nums) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == num) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }

}
