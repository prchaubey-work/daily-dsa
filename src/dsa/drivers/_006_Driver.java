package dsa.drivers;

import dsa.arrays._006_Majority_Element;

import java.util.Arrays;

public class _006_Driver {

    public static void main(String[] args) {
        int[][] testNums = {
                {3,2,3},                // Expected 3
                {2,2,1,1,1,2,2}         // Expected 2
        };

        int[] expectedOutputs = {
                3,
                2
        };

        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Suggest GC to clean up heap before measurement

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.nanoTime();

        System.out.println("=== Running Test Cases for _004_Container_With_Most_Water ===");

        for (int i = 0; i < testNums.length; i++) {
            int[] nums = testNums[i];
            int expected = expectedOutputs[i];

            int actual = _006_Majority_Element.majorityElement(nums);

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
