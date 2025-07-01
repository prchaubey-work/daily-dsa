package dsa.arrays;

public class _004_Container_With_Most_Water {

    public static int maxArea(int[] height){
        // return bruteForce(height);
        return optimal(height);
    }

    /**
     * time O(n) space O(1)
     */
    private static int optimal(int[] height) {
        int left = 0, right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentWater = width * minHeight;
            maxWater = Math.max(maxWater, currentWater);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    /**
     * time O(n^2) space O(1)
     */
    private static int bruteForce(int[] height) {
        int maxWater = 0;
        for(int i=0; i<height.length; i++){
            for(int j=i; j<height.length; j++){
                int water = (j-i) * Math.min(height[i], height[j]);
                if(water > maxWater){
                    maxWater = water;
                }
            }
        }
        return maxWater;
    }

}
