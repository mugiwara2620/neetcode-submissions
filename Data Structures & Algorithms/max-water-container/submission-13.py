class Solution:
    def maxArea(self, heights: List[int]) -> int:
        n = len(heights)
        start = 0
        end = n - 1
        maxAreaa = 0
        while start < end :

            left = heights[start]
            right = heights[end]
            height = min(left, right)
            maxAreaa = max(maxAreaa, (end - start) * height)

            if left > right:
                
                end -=1
            else:
                
                start +=1 
        return maxAreaa