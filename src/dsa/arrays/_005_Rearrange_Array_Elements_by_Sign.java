package dsa.arrays;

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
     * time O(2N) space O(2N)
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
