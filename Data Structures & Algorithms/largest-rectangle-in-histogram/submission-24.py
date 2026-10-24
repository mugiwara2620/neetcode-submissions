class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        stack = []
        maxArea = 0
        n = len(heights)
        if n > 0:
            stack.append([0, heights[0]])
        else:
            return maxArea
        
        for i in range(1, n):
            h = heights[i]
            start = i

            while len(stack) != 0 and  stack[-1][1] > h  :
                index, height_i_1 = stack.pop()
                maxArea = max(maxArea, (i-index) * height_i_1)
                start = index
            stack.append([start, h])
            
        while len(stack) > 0:
            index, h = stack.pop()
            maxArea = max(maxArea, (n-index) * h)
        
        return maxArea


