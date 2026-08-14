class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left, right = 0, len(heights)-1
        u = 0
        while left<right:
            h1 = heights[left]
            h2 = heights[right]
            hmin = min(h1,h2)
            u = max(u, hmin*(right-left))
            if h1 > h2:
                right-=1
            else:
                left+=1
        return u