package dsa.drivers;

import dsa.arrays._003_Best_Time_to_Buy_and_Sell_Stock;

import java.util.Arrays;

public class _003_Driver {

    public static void main(String[] args) {
        int[][] testNums = {
                {7,1,5,3,6,4},      // Expected 5
                {7,6,4,3,1}         // Expected 0
        };

        int[] expectedOutputs = {
                5,
                0
        };

        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Suggest GC to clean up heap before measurement

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.nanoTime();

        System.out.println("=== Running Test Cases for _003_Best_Time_to_Buy_and_Sell_Stock ===");

        for (int i = 0; i < testNums.length; i++) {
            int[] nums = testNums[i];
            int expected = expectedOutputs[i];

            int actual = _003_Best_Time_to_Buy_and_Sell_Stock.maxProfit(nums);

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
