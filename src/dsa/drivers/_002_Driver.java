package dsa.drivers;

import dsa.arrays._002_Max_Subarray_Sum;

import java.util.Arrays;


public class _002_Driver {

    public static void main(String[] args) {
        int[][] testNums = {
                {-2,1,-3,4,-1,2,1,-5,4},   // Expected 6
                {1},                       // Expected 1
                {5,4,-1,7,8}               // Expected 23
        };

        int[] expectedOutputs = {
                6,
                1,
                23
        };

        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Suggest GC to clean up heap before measurement

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.nanoTime();

        System.out.println("=== Running Test Cases for _001_Longest_Subarray_With_Sum_K ===");

        for (int i = 0; i < testNums.length; i++) {
            int[] nums = testNums[i];
            int expected = expectedOutputs[i];

            int actual = _002_Max_Subarray_Sum.maxSubArray(nums);

            if (actual == expected) {
                System.out.println("✅ Test Case " + (i + 1) + " Passed");
            } else {
                System.out.println("❌ Test Case " + (i + 1) + " Failed");
                System.out.println("   Input nums: " + Arrays.toString(nums));
                System.out.println("   Expected: " + expected);
                System.out.println("   Actual: " + actual);
            }
        }

        long endTime = System.nanoTime();
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        long totalTimeMs = (endTime - startTime) / 1_000_000;       // ms
        long memoryUsedKb = (memoryAfter - memoryBefore) / 1024;    // KB

        System.out.println("\n=== Summary ===");
        System.out.println("Total Time Taken: " + totalTimeMs + " ms");
        System.out.println("Total Approx. Memory Used: " + memoryUsedKb + " KB");
    }

}
