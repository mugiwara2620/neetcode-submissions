class Solution:
    def maxArea(self, heights: List[int]) -> int:
        n = len(heights)
        start = 0
        end = n - 1
        maxAreaa = 0
        while start < end :

            left = heights[start]
            right = heights[end]

            if left > right:
                maxAreaa = max(maxAreaa, (end - start) * right)
                end -=1
            else:
                maxAreaa = max(maxAreaa, (end - start) * left)
                start +=1 
        return maxAreaa