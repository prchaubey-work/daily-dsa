package dsa.drivers;

import dsa.arrays._004_Container_With_Most_Water;

import java.util.Arrays;

public class _004_Driver {

    public static void main(String[] args) {
        int[][] testNums = {
                {1,8,6,2,5,4,8,3,7},      // Expected 49
                {1,1}                     // Expected 1
        };

        int[] expectedOutputs = {
                49,
                1
        };

        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Suggest GC to clean up heap before measurement

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.nanoTime();

        System.out.println("=== Running Test Cases for _004_Container_With_Most_Water ===");

        for (int i = 0; i < testNums.length; i++) {
            int[] nums = testNums[i];
            int expected = expectedOutputs[i];

            int actual = _004_Container_With_Most_Water.maxArea(nums);

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
