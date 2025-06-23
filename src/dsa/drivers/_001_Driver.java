package dsa.drivers;

import dsa.arrays._001_Longest_Subarray_With_Sum_K;

import java.util.Arrays;


public class _001_Driver {

    public static void main(String[] args) {
        int[][] testNums = {
                {10, 5, 2, 7, 1, 9},       // Expected 4
                {1, 2, 3, 4, 5},           // Expected 3
                {1, 1, 1, 1, 1},           // Expected 5
                {5, 1, 2, 3, 4},           // Expected 3
                {1, 2, 3},                 // Expected 0
                {15},                      // Expected 1
                {7, 8, 2, 5, 1},           // Expected 3
                {2, 0, 0, 3}               // Expected 3
        };

        int[] testKs = {
                15,
                9,
                5,
                6,
                10,
                15,
                15,
                3
        };

        int[] expectedOutputs = {
                4,
                3,
                5,
                3,
                0,
                1,
                3,
                3
        };

        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Suggest GC to clean up heap before measurement

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.nanoTime();

        System.out.println("=== Running Test Cases for _001_Longest_Subarray_With_Sum_K ===");

        for (int i = 0; i < testNums.length; i++) {
            int[] nums = testNums[i];
            int k = testKs[i];
            int expected = expectedOutputs[i];

            int actual = _001_Longest_Subarray_With_Sum_K.getLongestSubarraySize(nums, k);

            if (actual == expected) {
                System.out.println("✅ Test Case " + (i + 1) + " Passed");
            } else {
                System.out.println("❌ Test Case " + (i + 1) + " Failed");
                System.out.println("   Input nums: " + Arrays.toString(nums));
                System.out.println("   Input k: " + k);
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
