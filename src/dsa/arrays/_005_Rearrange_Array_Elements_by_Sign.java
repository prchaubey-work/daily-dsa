package dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class _005_Rearrange_Array_Elements_by_Sign {

    public static int[] rearrangeArray(int[] nums) {
        // return bruteForce(nums);
        return optimal(nums);
    }

    /**
     * time O(n) space O(n)
     */
    private static int[] optimal(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0, negIndex = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                result[posIndex] = nums[i];
                posIndex += 2;
            }else{
                result[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return result;
    }

    /**
     * time O(2n) space O(2n)
     * when # of +ve and -ve are not equal
     */
    private static int[] optimal2(int[] nums) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        // Separate into positive and negative lists
        for (int num : nums) {
            if (num >= 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        int p = 0, n = 0, i = 0;
        int[] result = new int[nums.length];

        // Alternate placement
        while (p < positives.size() && n < negatives.size()) {
            result[i++] = positives.get(p++);
            result[i++] = negatives.get(n++);
        }

        // Append remaining positives
        while (p < positives.size()) {
            result[i++] = positives.get(p++);
        }

        // Append remaining negatives
        while (n < negatives.size()) {
            result[i++] = negatives.get(n++);
        }

        return result;
    }

    /**
     * time O(2n) space O(2n)
     */
    private static int[] bruteForce(int[] nums) {
        int[] positives = new int[nums.length];
        int[] negatives = new int[nums.length];
        int indexP = -1, indexN = -1;

        for(int num : nums){
            if(num > 0) {
                indexP++;
                positives[indexP] = num;
            }else{
                indexN++;
                negatives[indexN] = num;
            }
        }

        int curr = 0;
        indexP = 0;
        indexN = 0;
        while(curr < nums.length){
            nums[curr++] = positives[indexP++];
            nums[curr++] = negatives[indexN++];
        }

        return nums;
    }

}
