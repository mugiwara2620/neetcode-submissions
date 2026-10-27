class Solution:
    def trap(self, height: List[int]) -> int:
        n = len(height)

        water_area = 0

        start = 0
        end = n-1
        maxL, maxR = 0, 0


        while start <= end:
            if height[start] < height[end]:
                maxL = max(maxL, height[start])
                water_area += maxL - height[start]
                start += 1
            else:
                maxR = max(maxR, height[end])
                water_area += maxR - height[end]
                end -= 1

        return water_area
