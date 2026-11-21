
from typing import List

class Solution:
    def findSubtreeSizes(self, parent: List[int], s: str) -> List[int]:
        n = len(parent)

        # Build the original tree
        children = [[] for _ in range(n)]
        for i in range(1, n):
            children[parent[i]].append(i)

        ans = [1] * n
        prev = [-1] * n

        # Most recently visited node for each character
        last = {}

        # Iterative DFS: (node, exiting)
        stack = [(0, False)]

        while stack:
            node, exiting = stack.pop()
            ch = s[node]

            if not exiting:
                # Save the closest matching ancestor
                prev[node] = last.get(ch, -1)
                last[ch] = node

                stack.append((node, True))

                for child in children[node]:
                    stack.append((child, False))

            else:
                # Restore the previous ancestor for this character
                last[ch] = prev[node]

                # Determine the node's final parent
                p = prev[node] if prev[node] != -1 else parent[node]

                if p != -1:
                    ans[p] += ans[node]

        return ans
