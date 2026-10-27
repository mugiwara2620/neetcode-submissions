class Solution:
    def search(self, nums: List[int], target: int) -> int:
        n = len(nums)
        start = 0
        end = n - 1 
        
        while start <= end:
            m = (end + start) // 2
            if nums[m] > target:
                end = m -1
            elif nums[m] < target:
                start = m + 1
            else:
                return m
        return -1