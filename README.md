## 📘 Problem Progress Tracker

| #   | Topic   | Problem                          | File Path                                           | LeetCode Link                                 | Solved | Crushed | Date Solved | Tags        |
|-----|---------|----------------------------------|-----------------------------------------------------|-----------------------------------------------|-------|-------|-------------|-------------|
| 001 | Arrays  | Longest Subarray with Sum K      | `arrays/_001_Longest_Subarray_With_Sum_K.java`      | [🔗](https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/) | ✅    | ❌     | 2025-06-23  |             |
| 002 | Arrays  | Max Subarray Sum                 | `arrays/_002_Max_Subarray_Sum.java`                 | [🔗](https://leetcode.com/problems/maximum-subarray/) | ✅     | ❌     | 2025-06-24  |             |
| 003 | Arrays  | Best Time to Buy and Sell Stock  | `arrays/_003_Best_Time_to_Buy_and_Sell_Stock.java`  | [🔗](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | ✅     | ✅     | 2025-06-30  |             |
| 004 | Arrays  | Container With Most Water        | `arrays/_004_Container_With_Most_Water.java`        | [🔗](https://leetcode.com/problems/container-with-most-water/) | ✅     | ✅     | 2025-07-01  | Two Pointer |
| 005 | Arrays  | Rearrange Array Elements by Sign | `arrays/_005_Rearrange_Array_Elements_by_Sign.java` | [🔗](https://leetcode.com/problems/rearrange-array-elements-by-sign/) | ✅     | ✅     | 2025-07-01  |  |
| 006 | Arrays  | Majority Element                 | `arrays/_006_Majority_Element.java`                 | [🔗](https://leetcode.com/problems/majority-element/) | ✅     | ❌     | 2025-07-02  |  |


<details>
<summary><strong>🧠 Intuition for #001: Longest Subarray with Sum K</strong></summary>

**Brute Force:**  
Generate all possible subarrays and check if their sum equals `k`.

**Better (Prefix Sum + HashMap):**  
Maintain a running prefix sum and store the earliest index where each sum occurs.  
At each index, calculate `rem = currentSum - k`.  
If this `rem` was seen before, it means a subarray summing to `k` exists — update max length.

**Optimal (Sliding Window, Non-negative only):**
Use a sliding window with two pointers.  
Expand the window from the right and shrink from the left if the sum exceeds `k`.  
When sum equals `k`, update the maximum subarray length.
</details>

<br>

<details>
<summary><strong>🧠 Intuition for #002: Max Subarray Sum</strong></summary>

**Optimal:**
Optimal: Iterate through the array while maintaining a running sum. 
Reset the sum to zero when it becomes negative, and update the maximum sum and its indices whenever a higher sum is found.
</details>

<br>

<details>
<summary><strong>🧠 Intuition for #003: Best Time to Buy and Sell Stock</strong></summary>

**Optimal:**
Maintain the minimum price seen so far while iterating through the array, and at each step, calculate the current profit. 
Update the maximum profit whenever the current profit exceeds it.
</details>

<br>

<details>
<summary><strong>🧠 Intuition for #004: Container With Most Water</strong></summary>

**Optimal:**
Use two pointers left and right, move the pointer whose height is less. For each step find the water that can be stored. 
</details>

<br>

<details>
<summary><strong>🧠 Intuition for #005: Rearrange Array Elements by Sign</strong></summary>

**Optimal:**
Divide the array into two parts- one comprising of only positive integers and the other of negative integers.
Merge the two parts to get the resultant array. It is not required to do the modifications in-place.
</details>

<br>

<details>
<summary><strong>🧠 Intuition for #006: Majority Element</strong></summary>

**Brute Force:**
Nested for loops to check the frequency of each element.

**Better:**
Use hashmap to store frequency of each element.

**Optimal (Boyer-Moore Voting Algorithm):**
🚀 Real-World Analogy: Voting System
Imagine a voting scenario where each element in the array is a candidate.
- Each occurrence of a number is a vote.
- If a number gets canceled out by a different number (i.e., opposition), it loses a vote.
- The true majority candidate (if one exists) will outlast all others because it has more votes than any other.

</details>