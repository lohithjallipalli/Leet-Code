
class Solution:
    def minimumChanges(self, s: str, k: int) -> int:
        n = len(s)

        # Precompute divisors
        factors = [[] for _ in range(n + 1)]

        for d in range(1, n):
            for x in range(d * 2, n + 1, d):
                factors[x].append(d)

        # Calculate cost to convert each substring
        cost = [[0] * n for _ in range(n)]

        for i in range(n):
            for j in range(i + 1, n):
                length = j - i + 1
                best = float('inf')

                for d in factors[length]:
                    changes = 0

                    for offset in range(d):
                        left = i + offset
                        right = j - d + 1 + offset

                        while left < right:
                            if s[left] != s[right]:
                                changes += 1

                            left += d
                            right -= d

                    best = min(best, changes)

                cost[i][j] = best

        # DP: minimum changes to partition s[i:] into j parts
        INF = float('inf')
        dp = [[INF] * (k + 1) for _ in range(n + 1)]

        dp[n][0] = 0

        for i in range(n - 1, -1, -1):
            for parts in range(1, k + 1):
                for end in range(i + 1, n):
                    dp[i][parts] = min(
                        dp[i][parts],
                        cost[i][end] + dp[end + 1][parts - 1]
                    )

        return dp[0][k]
