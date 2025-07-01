package dsa.arrays;

public class _005_Rearrange_Array_Elements_by_Sign {

    public static int[] rearrangeArray(int[] nums) {
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
