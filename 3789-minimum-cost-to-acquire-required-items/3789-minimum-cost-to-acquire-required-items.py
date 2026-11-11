
class Solution:
    def minimumCost(self, cost1: int, cost2: int,
                    costBoth: int, need1: int, need2: int) -> int:
        lumiscaron = (cost1, cost2, costBoth, need1, need2)

        common = min(need1, need2)

        total = common * min(costBoth, cost1 + cost2)

        total += (need1 - common) * min(cost1, costBoth)
        total += (need2 - common) * min(cost2, costBoth)

        return total
