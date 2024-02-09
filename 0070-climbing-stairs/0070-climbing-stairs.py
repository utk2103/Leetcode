class Solution:
    def climbStairs(self, n: int) -> int:
        list1 = {}
        def dfs(i):
            if i >= n: return 1 if i == n else 0
            if i not in list1:
                list1[i] = dfs(i + 1) + dfs(i + 2)
            return list1[i]
        return dfs(0)