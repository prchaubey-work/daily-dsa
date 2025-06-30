## 📘 Problem Progress Tracker

| #   | Topic   | Problem                           | File Path                                          | LeetCode Link                                  | Solved | Crushed | Date Solved |
|-----|---------|-----------------------------------|----------------------------------------------------|------------------------------------------------|-------|-------|-------------|
| 001 | Arrays  | Longest Subarray with Sum K       | `arrays/_001_Longest_Subarray_With_Sum_K.java`     | [🔗](https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/) | ✅    | ❌     | 2025-06-23  |
| 002 | Arrays  | Max Subarray Sum                  | `arrays/_002_Max_Subarray_Sum.java`                | [🔗](https://leetcode.com/problems/maximum-subarray/) | ✅     | ❌     | 2025-06-24  |
| 003 | Arrays  | Best Time to Buy and Sell Stock   | `arrays/_003_Best_Time_to_Buy_and_Sell_Stock.java` | [🔗](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | ✅     | ✅     | 2025-06-30  |

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