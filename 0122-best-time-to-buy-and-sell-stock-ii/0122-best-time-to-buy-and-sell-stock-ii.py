class Solution:
    def maxProfit(self, a):
        profit = 0
        for i in range(1, len(a)):
            if a[i] > a[i - 1]:
                profit += a[i] - a[i - 1]
        return profit
