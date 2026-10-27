import numpy as np
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        nums = np.concatenate((matrix))
        
        n= len(nums)

        start = 0
        end = n - 1

        while start <= end:
            m = (end - start) // 2 + start 
            if nums[m] > target:
                end = m -1
            elif nums[m] < target:
                start = m + 1
            else:
                return True
        return False
            