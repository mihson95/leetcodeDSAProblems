## Problem
### Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. 
You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency
of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

#### problem url: https://leetcode.com/problems/combination-sum/description/

---
## Solution

### Optimizations

 1. Sorting the array. 
 2. Reducing size of DFS tree by adding remaining sum condition.
---
## Complexity Analysis

Let N be the number of candidates, T be the target value, and M be the minimal value among the candidates.

### Time Complexity: 
O(N^(T/M+1))
- The maximal depth of the tree, would be (T/M),where we keep on adding the smallest element to the combination. As we know, the maximal number of nodes in N-ary tree of T/M height would be N^((T/M)+1)

## Space Complexity: 
O(T/M)

- We implement the algorithm in recursion, which consumes some additional memory in the function call stack.
- The number of recursive calls can pile up to (T/M), where we keep on adding the smallest element to the combination. As a result, the space overhead of the recursion is O(T/M).
- In addition, we keep a combination of numbers during the execution, which requires at most O(T/M) space as well.

---
## Further Reading

Here are a series of problems that one can solve, with some tweaks of the backtracking algorithm presented in this article, 
thanks to the great list compiled by issac3 in the discussion forum.

- [Subsets](https://leetcode.com/problems/subsets)
- [Subsets II](https://leetcode.com/problems/subsets-ii/)
- [Permutations](https://leetcode.com/problems/permutations/)
- [Permutations II](https://leetcode.com/problems/permutations-ii/)
- [Combinations](https://leetcode.com/problems/combinations/)
- [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/)
- [Combination Sum III](https://leetcode.com/problems/combination-sum-iii/)
- [Palindrome Partition](https://leetcode.com/problems/palindrome-partitioning/)
